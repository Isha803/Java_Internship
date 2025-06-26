class MyTask extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();

        t2.setDaemon(true);
        t1.start();
        t2.start();

        try {
            t1.join();  // Main thread waits for t1 to finish
            t2.join();  // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ends after t1 and t2 complete.");
    }
}
