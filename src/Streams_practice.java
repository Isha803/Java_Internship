import java.util.*;
import java.util.Arrays;
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
        System.out.println(stringList.stream().filter(x->x.toLowerCase().contains("apple"))
                .max(Comparator.comparingInt(String::length)));
        //Sorting of maps on the basis of associated values
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"cherry");
        map.put(4,"apple pie");
        map.put(5,"banana split");
        map.put(6,"apple tart");
        map.put(7,"avocado");
        map.put(8,"apricot");
        map.put(9,"blueberry");
        map.put(10,"orange");
        map.put(11,"orange");
        System.out.println(map);
        Map<Integer, String> lmap = map.entrySet()
                .stream()
                .sorted((a, b) -> a.getValue().compareTo(b.getValue()))
                .collect(Collectors.toMap(
                        e1 -> e1.getKey(),
                        e1 -> e1.getValue(),
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println("Sorted map based on values: " + lmap);
        //find duplicate elements in a list
        System.out.println("Finding duplicate elements in a list:");
        Set<String> duplicates = new HashSet<>();
        stringList.stream().filter(n-> !duplicates.add(n))
                .forEach(System.out::println);
        //Group people by age
        class Person {
            String name;
            int age;
            Person(String n, int a) { name = n; age = a; }
            @Override
            public String toString() {
                return "name=" + name + ", age=" + age;
            }
        }

        List<Person> people = List.of(
                new Person("Alice", 30),
                new Person("Bob", 40),
                new Person("Charlie", 30)
        );

        Map<Integer, List<Person>> byAge = people.stream()
                .collect(Collectors.groupingBy(p -> p.age));
        System.out.println("Grouping people by age:");
        System.out.println(byAge);
        //Find the most frequent character in a string
        String input = "mississippi";
        Optional<Map.Entry<Character, Long>> x=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println("Finding the most frequent character in the string: " + input);
        x.ifPresentOrElse(c -> System.out.println("Most frequent character: " + c.getKey() + " with count: " + c.getValue()),
                () -> System.out.println("No characters found")
        );
    }
}
