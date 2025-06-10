//interface grandparent{
//    //void fun();
//    default void fun2(){
//        System.out.println("hello from fun2, grandparent");
//    }
//}
//@FunctionalInterface
//interface parent extends grandparent{
//    void fun1();
//    @Override
//    default void fun2(){
//        System.out.println("hello from fun2, parent");
//    }
//    static void fun3(){
//        System.out.println("hello from fun3");
//    }
//}
//interface child{
//    default void fun2(){
//        System.out.println("hello from fun2, child");
//    }
//}
//public class func_Interface implements parent,child{
//    public void fun1(){
//        System.out.println("heyy");
//    }
//    static void fun3(){
//        System.out.println("hello from fun3, inside main class");
//    }
//    public static void main(String[] args) {
//        //()-> System.out.println("hello");
//        parent obj =new func_Interface();
//        obj.fun1();
//        //obj.fun2();
//        parent.fun3();
//        func_Interface obj2=new func_Interface();
//        obj2.fun2();
//        parent.fun3();
//        func_Interface.fun3();
//        fun3();
//    }
//
//    @Override
//    public void fun2() {
//        System.out.println("my own implementation");
//        //parent.super.fun2();
//        //child.super.fun2();
//    }
//}
@FunctionalInterface
interface employee{
    String get_employee();
}
@FunctionalInterface
interface sum{
    int add(int a, int b);
}

public class func_Interface {
    public static void main(String[] args) {
        employee engineer=()->"engineer";
        System.out.println(engineer.get_employee());
        employee analyst=()->"analyst";
        System.out.println(analyst.get_employee());
        sum obj=(a,b)->a+b;
//            int result=a+b;
//            return result;
        System.out.println(obj.add(5,3));
    }
}
