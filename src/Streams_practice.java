import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams_practice {
    public static void main(String[] args) {
     /*   //Print all elements in a list
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
        List<String> stringList = Arrays.asList("apple", "banana", "cherry","apple pie", "banana split","apple tart");
        stringList.stream().map(x-> x.toUpperCase()) // Convert each string to uppercase
                .forEach(System.out::println); // Print each uppercase string
        //Find the first element that starts with "A"
        System.out.println("Finding the first element that starts with 'A':");
        Optional<String> s = stringList.stream()
                .filter(x->x.charAt(0) == 'A'||x.charAt(0)=='a') // Filter strings that start with 'A'
                .findFirst();
        s.ifPresent(System.out::println);
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
//        Use reduce to concatenate a list of strings with hyphens:   */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "apple pie", "banana split", "apple tart",
                "avocado", "apricot", "blueberry", "blackberry","apple");
        //Find the second highest number in a list
        list.stream().sorted((a,b)->b-a).skip(1).findFirst()
                .ifPresentOrElse(x-> System.out.println(x),() -> System.out.println("No second highest number found!"));
        //count frequency of each word in a list
        Map<String,Long> frequencymap=stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency of each word in the list:"+ frequencymap);
        //Join strings with comma
        String joinedString = stringList.stream().collect(Collectors.joining(", "));
        System.out.println("Joined string: " + joinedString);
        //Find the length of the longest string
        int maxlength=stringList.stream().mapToInt(x->x.length()).max().orElse(0);
        System.out.println("Length of the longest string: " + maxlength);
        //Find all strings that start with "apple".
        stringList.stream().filter(x -> x.toLowerCase().startsWith("apple")).distinct()
                .forEach(System.out::println);
        //Group a list of strings by their length.
        System.out.println("Grouping strings by their length:");
        stringList.stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
        //Group strings based on their first character.
        System.out.println("Grouping strings based on their first character:");
        stringList.stream().sorted().forEach(System.out::println);
        //Find the longest string that contains the word "apple".
        System.out.println("Finding the longest string that contains the word 'apple':");

    }
}
