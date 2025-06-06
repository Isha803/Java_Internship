////class student{
////    private int id;
////    private String name;
////    student(){
////        System.out.println("executing default constructor");
////    }
////    student(int id, String name){
////        System.out.println("executing parameterized constructor");
////        this.id=id;
////        this.name=name;
////    }
////    student(student obj2){
////        System.out.println("executing copy constructor");
////        this.id=obj2.id;
////        this.name=obj2.name;
////    }
////    //getters & setters
////    public int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////    public void print(){
////        System.out.println("name:"+this.getName()+"\nid:"+this.getId());
////    }
////}
///// ///////////////////////////////////////////////////////////////////////
////class parentclass{
////        String name;
////        int age;
////    parentclass(){
////        System.out.println("parent class constructor is called either implicitly or expicitly");
////    }
////    parentclass(String name, int age){
////        this.name=name;
////        this.age=age;
////        System.out.println(name+" "+age);
////    }
////}
////class childclass extends parentclass{
////    int grade;
////    String name;
////    int age;
////    childclass(){
////        super();
////        System.out.println("child class constructor is called");
////    }
////    childclass(String name, int age, int grade){
//////        super();
////        super(name,age);
////        this.name=name;
////        this.age=age;
////        this.grade=grade;
////        System.out.println(name+" "+age+" "+grade);
////    }
////}
///// /////////////////////////////////////////////////////////////
//class class1{
//    public void method1(){
//        System.out.println("from class1");
//    }
//}
//class class2 extends class1{
//    public void method2(){
//        System.out.println("from class2");
//    }
//}
//class class3 extends class2{
//    public void method3(){
//        System.out.println("from class3");
//    }
//}
//class class4 extends class1{
//    public void method4(){
//        System.out.println("from class4");
//    }
//}
//interface int1{
//    final int a=10;
//    void meth();
//}
//interface int2 extends int1 {
//    void meth2();
//}
//class A implements int1,int2{
//    int b;
//    public void setb(int c){
//        b=c;
//    }
//    @Override
//    public void meth() {
//        System.out.println("method1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("method2, using this keyword. Value of xyz is="+this.a);
//    }
//    A get(){
//        return this;
//    }
//    void display(){
//        //When both class local variables and calling object's variables have the same name,
//        // the local variable within the method or block of code takes precedence.
//        // This is often referred to as "shadowing" where the local variable temporarily masks the class member's variable.
//        System.out.println("value of a is:"+this.b);  //only b instead of this.b will also work
//    }
//}
///// /////////////////////////////////////////////////////////////////////
//public class oops {
//    public static void main(String[] args){
//        /// /////////working on types of constructors,getters,setters////////////////
////        //default constructor
////     student obj=new student();
////     //parameterized constructor
////     student obj2=new student(12,"zoro");
////     //copy constructor
////     student obj3=new student(obj2);
////     obj2.print();
////     obj3.setName("sanji");
////     obj3.print();
//        /// ///////working on inheritance, super keyword, constructor//////////////
////        parentclass obj1=new parentclass("dragon",39);
////        childclass obj=new childclass("luffy",17,9);
//        /// //////working with inheritance, interfaces and this keyword
//        //class1 obj=new class1();
////        System.out.println("obj2");
////        class2 obj2=new class2();
////        obj2.method1();
////        obj2.method2();
////        System.out.println("obj3");
////        class3 obj3=new class3();
////        obj3.method1();
////        obj3.method2();
////        obj3.method3();
////        System.out.println("obj3");
////        class4 obj4=new class4();
////        obj4.method1();
////        obj4.method4();
//        A xyz=new A();
//        A xyz2=new A();
//        System.out.println(A.a);
//        xyz.meth();
//        xyz.meth2();
//        xyz.setb(20);
//        xyz.get().display();
//        xyz2.setb(30);
//        xyz2.get().display();
//    }
//}
//////////////////////abstract classes//////////////////////////
//abstract class A{
//    int a=20;
//    public void fun1(){
//        System.out.println("from abstract class");
//    }
//    abstract public void fun2();
//    abstract public void fun3();
//}
//abstract class B extends A{
//    public void fun2(){
//        System.out.println("executing function 2");
//    }
//}
//class C extends B{
//    public void fun3(){
//        System.out.println("executing function 3");
//    }
//}
//class oops{
//    public static void main(String[] args){
//        C obj=new C();
//        obj.fun1();
//        obj.fun2();
//        obj.fun3();
//    }
//}
///////////////////method overriding & overloading///////////////////
class square{
    public void area(int dim){
        System.out.println("area of square is:"+dim*dim);
    }
}
class circle extends square{
    //method overriding
    @Override
    public void area(int dim){
        System.out.println("area of circle is:"+3.14*dim*dim);
    }
    public void fun1(){
        System.out.println("welcome");
    }
    //method overloading
    public void fun1(String name){
        System.out.println("welcome "+name);
    }
}
class oops{
    public static void main(String[] args){
        square obj1=new square();
        circle obj2=new circle();
        obj1.area(4);
        obj2.area(1);
        obj2.fun1();
        obj2.fun1("Bob");

        String s = "Isha";
        s = "jain";
        s = new String("jain");
        System.out.println(s);
    }
}