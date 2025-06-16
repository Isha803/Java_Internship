import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//method and constructor reference
public class reference {
    public static void print(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        //names.forEach(x-> System.out.println(x)); // Lambda expression
        names.forEach(reference::print); // Method reference
        //List<student3> students=names.stream().map(x->new student3(x)).collect(Collectors.toList());
        List<student3> students=names.stream().map(student3::new).collect(Collectors.toList());
    }
}
class student3{
    String name;

    public student3(String name) {
        this.name = name;
    }
}
