import java.util.List;
import java.util.Arrays;
public class Streams_practice {
    public static void main(String[] args) {
        //Print all elements in a list
        System.out.println("Printing all elements in the list:");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
        list.forEach(System.out::println); // Print each element in the stream
        //Filter even numbers and print them
        System.out.println("Printing even numbers from the list:");
        list.stream().filter(x -> x % 2 == 0) // Filter even numbers
                .forEach(System.out::println); // Print each even number
        //Convert a list of strings to uppercase
        System.out.println("Converting strings to uppercase:");
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        stringList.stream().map(x-> x.toUpperCase()) // Convert each string to uppercase
                .forEach(System.out::println); // Print each uppercase string
        //Find the first element that starts with "A"
        System.out.println("Finding the first element that starts with 'A':");
        stringList.stream()
                .filter(x->x.charAt(0) == 'A'||x.charAt(0)=='a') // Filter strings that start with 'A'
                .forEach(System.out::println);
        //Find the sum of squares of odd numbers:
        System.out.println("Find the sum of squares of odd numbers");
        list.stream().filter(x->x%2!=0).map(x->x*x).forEach(System.out::println);
        //Find duplicate elements in a list:
//        Find duplicate elements in a list:
//        Count frequency of each word in a list:
//        Find the second-highest number in a list:
//        Flatten a list of lists:
//        Find longest word using streams:
//        Sort a list of objects by a field (e.g., salary):
//        Use reduce to concatenate a list of strings with hyphens:
    }
}
