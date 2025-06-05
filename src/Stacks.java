import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stacks obj=new Stacks();
        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//        st1.push(40);
//        System.out.println("after adding items:"+st1);
//        st1.pop();
//        System.out.println("after pop:"+st1);
//        System.out.println("using peek():"+st1.peek());
//        System.out.println("size of stack:"+st1.size());
//        System.out.println("is st1 empty?:"+st1.empty());
        String choice;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("----------Stack Operations----------");
            System.out.println("1.print\n2.push\n3.pop\n4.peek\n5.check size\n6.check if empty\nenter your choice:");
            String ch=sc.next();
            if(ch.equals("1")){
                obj.funprint(st1);
            } else if (ch.equals("2")) {
                System.out.println("enter number:");
                int x=sc.nextInt();
                obj.funpush(st1,x);
            }else if (ch.equals("3")) {
                obj.funpop(st1);
            }else if (ch.equals("4")) {
                obj.funpeek(st1);
            }else if (ch.equals("5")) {
                obj.funsize(st1);
            } else if (ch.equals("6")) {
                obj.funempty(st1);
            }else{
                System.out.println("invalid choice");
            }
            System.out.println("you wish to continue?:");
            choice=sc.next();
        }while(choice.equals("y"));
    }
    public void funprint(Stack<Integer> st1){
        System.out.println(st1);
    }
    public void funpush(Stack<Integer> st1,int num){
        st1.push(num);
    }
    public void funpop(Stack<Integer> st1){
        try {
            st1.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException: Stack is empty.");
        }
    }
    public void funpeek(Stack<Integer> st1){
        try {
            System.out.println(st1.peek());
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException: Stack is empty.");
        }
    }
    public void funsize(Stack<Integer> st1){
        System.out.println(st1.size());
    }
    public void funempty(Stack<Integer> st1){
        System.out.println(st1.empty());
    }
}
//Balanced Parentheses
//Check if a string has balanced parentheses using a stack.
//Example: "{[()()]}" is balanced; "([)]" is not.
//Reverse a String
//Reverse an Array
//Delete Middle Element from Stack
//Remove the middle element from a stack without using extra space.
//Check for Palindrome
//Sort a Stack

