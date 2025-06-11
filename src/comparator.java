import java.util.*;
//class list implements Comparator<Integer>{
//    public int compare(Integer a, Integer b){
//        return b-a;
//    }
//}
////////////////////////////////
class student{
    int id;
    String name;
    student(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return ("name:"+this.name+" id:"+this.id);
    }
}
/// ////////////////////////
public class comparator {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(78);
        li.add(8);
        li.add(7);
        li.add(68);
        li.add(81);
        //Collections.sort(li,new list());
        Collections.sort(li,(a,b)->b-a);
        System.out.println(li);
        System.out.println("class objects");
        student obj1=new student(2,"luffy");
        student obj2=new student(1,"zoro");
        student obj3=new student(3,"sanji");
        List<student> li2=new ArrayList<>();
        li2.add(obj1);
        li2.add(obj2);
        li2.add(obj3);
        Collections.sort(li2,(a,b)->b.id-a.id);
        System.out.println(li2);
//        System.out.println(li2.get(0).id+" "+li2.get(0).name);
//        System.out.println(li2.get(1).id+" "+li2.get(1).name);
//        System.out.println(li2.get(2).id+" "+li2.get(2).name);
    }
}
