import java.util.*;
public class Queues {
    public static void main(String[] args){
        Queues obj=new Queues();
        Deque<Integer> q1=new ArrayDeque<>();
//        q1.add(10);
//        q1.add(20);
//        q1.add(30);
//        q1.add(40);
//        System.out.println("after adding items:"+q1);
//        q1.remove();
//        System.out.println("after removal:"+q1);
//        System.out.println("using peek():"+q1.peek());
//        System.out.println("size of queue:"+q1.size());
//        System.out.println("is q1 empty?:"+q1.isEmpty());
        String choice;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("----------Queue Operations----------");
            System.out.println("1.print\n2.add\n3.remove\n4.peek\n5.check size\n6.check if empty\n7.clear\nenter your choice:");
            String ch=sc.next();
            if(ch.equals("1")){
                obj.funprint(q1);
            } else if (ch.equals("2")) {
                System.out.println("enter number:");
                int x=sc.nextInt();
                obj.funpush(q1,x);
            }else if (ch.equals("3")) {
                obj.funpop(q1);
            }else if (ch.equals("4")) {
                obj.funpeek(q1);
            }else if (ch.equals("5")) {
                obj.funsize(q1);
            } else if (ch.equals("6")) {
                obj.funempty(q1);
            } else if (ch.equals("7")) {
                obj.funclear(q1);
            } else{
                System.out.println("invalid choice");
            }
            System.out.println("you wish to continue?:");
            choice=sc.next();
        }while(choice.equals("y"));
    }
    public void funprint(Queue<Integer> q1){
        System.out.println(q1);
    }
    public void funpush(Queue<Integer> q1,int num){
        q1.add(num);
    }
    public void funpop(Queue<Integer> q1){
        try {
            q1.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: Queue is empty.");
        }
    }
    public void funpeek(Queue<Integer> q1){
            System.out.println(q1.peek());
    }
    public void funsize(Queue<Integer> q1){
        System.out.println(q1.size());
    }
    public void funempty(Queue<Integer> q1){
        System.out.println(q1.isEmpty());
    }
    public void funclear(Queue<Integer> q1){
        q1.clear();
    }
}
