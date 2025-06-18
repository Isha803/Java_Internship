class MyThread extends Thread{
//    MyThread(String name){
//        super(name);
//    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Thread1 is running: " + i);
        }
    }
}
class MyRunnable implements Runnable{
//    MyRunnable(String name){
//        Thread.currentThread().setName(name);
//    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Thread2 is running: " + i);
        }
    }
}
public class multithreading {
    public static void main(String[] args){
        System.out.println("Main thread started");
        Thread thread1 = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        thread2.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
    }
}
