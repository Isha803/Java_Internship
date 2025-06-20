import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;
/// /Multithreading, Thread methods.
/*class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
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
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted: " + e.getMessage());
//        }
        for(int i=0;i<100;i++){
            System.out.println("Thread2 is running: " + i);
            Thread.yield();
        }
    }
}
public class multithreading {
    public static void main(String[] args){
        System.out.println("Main thread started");
        //In your code, thread1 is the variable name referencing the MyThread object,
        // while "first" is the name assigned to the thread instance (used for identification via Thread.getName()).
        // You use thread1 to call methods like start(), not "first".
        Thread thread1 = new MyThread("first");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread1.setDaemon(true);
        thread2.setDaemon(true);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted: " + e.getMessage());
//        }
        thread1.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        thread2.start();
        //thread2.interrupt();
        //thread1.setPriority(Thread.MIN_PRIORITY);
        //thread2.setPriority(Thread.MAX_PRIORITY);
        try {
            Thread.sleep(20); // Keep main thread alive for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished");
        //Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
    }
}*/
////Synchronization
class Counter {
    private int count = 0;
// critical section
    public void increment() {
        count++;
    }
//    public void increment() {
//        synchronized (this) {
//            count++;
//        }


    public int getCount() {
        return count;
    }
}
class Mythread extends Thread {
    private Counter counter;

    public Mythread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
class multithreading{
    public static void main(String[] args) {
        Counter counter=new Counter();
        Mythread t1 = new Mythread(counter);
        //creates a new instance of the Mythread class, passing the counter object to its constructor, and assigns it to the variable t1.
        // This allows the new thread to access and use the shared Counter object.
        Mythread t2 = new Mythread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter.getCount());
    }
}
////Lock
/*class BankAccount {
    private int balance = 1000;
    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName()+"Processing with withdrawal");
//            try {
//                // Simulating a delay to demonstrate the lock
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted: " + e.getMessage());
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " completed withdrawal. New balance: " + balance);
//        } else {
//            System.out.println(Thread.currentThread().getName() + " insufficient funds for withdrawal of " + amount);
//        }
        try {
            //lock.lock();
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Processing with withdrawal");
                        // Simulating a delay to demonstrate the lock
                        Thread.sleep(5000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. New balance: " + balance);
                    } catch (Exception e) {
                        System.out.println("Exception caught");
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient funds for withdrawal of " + amount);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire lock, skipping withdrawal.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
class multithreading {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task=new Runnable() {
            @Override
            public void run() {
            account.withdraw(50);
            }
        };
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        thread1.start();
        thread2.start();
    }
}*/
//// ReentrantLock
/*class multithreading{
    private final Lock lock = new ReentrantLock();
    public void outerMethod() {
        lock.lock();
//        try {
//            lock.lockInterruptibly();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            System.out.println("Outer method is running");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }
    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method is running");
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        multithreading example = new multithreading();
        example.outerMethod();
    }
}*/
/// /Fairness of Locks
/*class FairnessLockExample {
    private final Lock lock = new ReentrantLock(true); // true for fair lock

    public void performTask() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is performing a task.");
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();
        Runnable task = example::performTask;

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");
        try {
            thread1.start();
            Thread.sleep(1000); // Ensure thread1 starts first
            thread2.start();
            Thread.sleep(1000); // Ensure thread2 starts after thread1
            thread3.start();
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}*/
/// /ReadWriteLock
/*class multithreading {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();
    public void increment() {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }finally {
            writeLock.unlock();
        }
    }
    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }
    public static void main(String[] args)throws InterruptedException {
        multithreading counter= new multithreading();
        Runnable readTask=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"read:"+counter.getCount());
                }
            }
        };
        Runnable writeTask=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+"incremented");
                }
            }
        };
        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);
        writerThread.start();
        readerThread1.start();
        readerThread2.start();
        writerThread.join();
        readerThread1.join();
        readerThread2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}*/
////Deadlock
/*class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + paper);
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + pen);
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}
class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen){
            paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}*/
////Thread Communication
////Thread Safety
/// /Thread using lambda expression
////Thread Pool