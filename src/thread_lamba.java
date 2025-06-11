//class student implements Runnable{
//    @Override
//    public void run() {
//        for(int i=1;i<=10;i++){
//            System.out.println(i+" hello");
//        }
//    }
//}
public class thread_lamba {
    public static void main(String[] args) {
        Runnable runnable=()->{
          for(int i=1;i<=10;i++){
              System.out.println(i+" hello");
          }
        };
        //student stu=new student();
        //stu.run();
        //Thread thread=new Thread(stu);
        //stu.run();
        for(int i=1;i<=10;i++){
            System.out.println(i+" bye");
        }
        Thread thread=new Thread(runnable);
        runnable.run();
    }
}
