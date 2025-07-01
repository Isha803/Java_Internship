import java.util.concurrent.*;
import java.util.concurrent.ArrayBlockingQueue;

public class TPExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                4,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new customThreadFactory(),
                new customRejectedExecutionHandler());
        executor.allowCoreThreadTimeOut(true);
        for (int i = 0; i < 7; i++) {
            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task processed by:" + Thread.currentThread().getName() );
            });
        }
        }
    }
class customThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.NORM_PRIORITY);
        t.setDaemon(false);
        //t.setName("CustomThread-" + t.getId());
        return t;
    }
}
class customRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task " + r.toString() + " has been rejected");
    }
}
