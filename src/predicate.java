import org.w3c.dom.ls.LSOutput;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class predicate {
    public static void main(String[] args) {
        System.out.println("Predicate Interface Example");
        int i = 2000000;
        Predicate<Integer> salary=(a)->a>1000000;
        System.out.println(salary.test(i)); // true
        if (salary.test(i)) {
            System.out.println("Salary is greater than 1000000");
        } else {
            System.out.println("Salary is less than or equal to 1000000");
        }
        Predicate<Integer> isEven=(a)->a%2==0;
        Predicate<String> startswithV=(s)->s.charAt(0)=='V';
        Predicate<String> endsswitht=(s)->s.charAt(s.length()-1)=='t';
        System.out.println(isEven.test(10)); // true
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for(int j:numbers){
            if(isEven.test(j)){
                System.out.println(j);
            }
        }
        Predicate<String> and=startswithV.and(endsswitht);
        System.out.println(startswithV.test("Voilet")); // true
        System.out.println(startswithV.test("Red")); // false
        System.out.println(and.test("Voilet")); // true
        Predicate<String> or=startswithV.or(endsswitht);
        System.out.println(and.test("Venessa")); // false
        System.out.println(startswithV.negate().test("Voilet")); // false
        student2 obj=new student2(23,"Mark");
        Predicate<student2> checkid=x->x.id<61;
        System.out.println(checkid.test(obj));
        if(checkid.test(obj)){
            System.out.println("student of class 6A");
        }
        else{
            System.out.println("student of class 6B");
        }
        Predicate<Object> predicate=Predicate.isEqual("venessa");
        System.out.println(predicate.test("venessa")); // true
        System.out.println("function interface example");
        Function<String,Integer> function=x->x.length();
        System.out.println(function.apply("Hello")); // 5
        Function<String,String> function2=x->x.substring(0,3);
        System.out.println(function2.apply("Hello")); // Hel
        Function<String,String> function3=x->x.toUpperCase();
        System.out.println(function3.apply("Hello")); // HELLO
        List<student2> stu=new ArrayList<>();
        stu.add(new student2(1,"Alice"));
        stu.add(new student2(2,"Bob"));
        Function<List<student2>,List<student2>> studentsA=li-> {
            List<student2> result = new ArrayList<>();
            for (student2 j : li) {
                if (j.name.charAt(0) == 'A') {
                    result.add(j);
                }
            }
            return result;
        };
        System.out.println(studentsA.apply(stu));
        Function<String, String> fun=function2.andThen(function3);
        System.out.println(fun.apply("Hello")); // HEL
        Function<Integer,Integer> fun2=x->x+10;
        Function<Integer,Integer> fun3=x->x*2;
        Function<Integer,Integer> fun4=fun2.andThen(fun3);
        Function<Integer,Integer>fun6=fun3.andThen(fun2);
        Function<Integer,Integer> fun5=fun2.compose(fun3);
        System.out.println(fun4.apply(5)); // 30
        System.out.println(fun4.apply(5)); // 30
        System.out.println(fun5.apply(5)); // 20
        Function<String,String> fun7=Function.identity();
        System.out.println(fun7.apply("Mark")); // Mark
        System.out.println("Consumer Interface Example");
        Consumer<String> consumer=(s)-> System.out.println(s);
        consumer.accept("Hello, Consumer!"); // Hello, Consumer!
        System.out.println("\n");
        Consumer<List<Integer>> consumer2=(list)-> {
            for (Integer num : list) {
                System.out.println(num+100);
            }
        };
        consumer2.accept(numbers); // prints each number in the list plus 100
        Consumer<List<Integer>> consumer3=(list)-> {
            for (Integer num : list) {
                System.out.println(num);
            }
        };
        System.out.println("\n");
        consumer3.accept(numbers); // prints each number in the list
        System.out.println("\n");
        Consumer<List<Integer>> consumer4=consumer2.andThen(consumer3);
        consumer4.accept(numbers); // prints each number in the list plus 100 and then prints each number in the list
        System.out.println("\n");
        Consumer<List<Integer>> consumer5=consumer3.andThen(consumer2);
        consumer5.accept(numbers);
    }
}
class student2{
    int id;
    String name;

    public student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

