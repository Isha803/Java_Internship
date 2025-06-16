import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class stream {
    public static void main(String[] args) {
//        int[] array={1, 2, 3, 4, 5};
//        int sum= Arrays.stream(array)
//                .filter(x -> x % 2 == 0) // Filter even numbers
//                .map(x -> x * 2) // Double the even numbers
//                .sum(); // Sum the results
//        List<String> list= Arrays.asList("apple", "banana", "cherry");
//        Stream<String> mystream=list.stream();
//        //mystream.forEach(System.out::println); // Print each element in the stream
//        String[] array={"apple", "banana", "cherry"};
//        Stream<String> stream= Arrays.stream(array);
//        Stream<Integer> intStream= Stream.of(1, 2, 3, 4, 5);
//        Stream<Integer> str=Stream.iterate(0, n -> n + 1).limit(10); // Generate a stream of integers from 0 to 9
//        Stream<Integer> str2=Stream.generate(() -> (int) (Math.random() * 100)).limit(10); // Generate a stream of random integers
        //List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> filteredlist = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println("Filtered List: " + filteredlist);
//        List<Integer> mappedlist = filteredlist.stream().map(x -> x / 2).collect(Collectors.toList());
//        System.out.println("Mapped List: " + mappedlist);
//        List<Integer> result = numbers.stream()
//                .filter(x -> x % 2 == 0) // Filter even numbers
//                .map(x -> x / 2) // Divide the even numbers by 2
//                .distinct() // Remove duplicates
//                .sorted((a,b)->b-a) // Sort the results
//                .limit(3) // Limit the results to the first 3 elements
//                .skip(1) // Skip the first element
//                .collect(Collectors.toList()); // Collect the results into a list
        //      System.out.println("Result: " + result);
//        List<Integer> collect = Stream.iterate(0, n -> n + 1)
//                .limit(101)
//                .skip(1)
//                .filter(n -> n % 2 == 0)
//                .map(x->x/10)
//                .distinct()
//                .sorted()
//                .peek(x-> System.out.println(x))
//                .collect((Collectors.toList()));
//        System.out.println(collect);
//        Long integer=Stream.iterate(0, n -> n + 1)
//                .limit(101)
//                .map(x -> x / 20)
//                .distinct()
//                .count();
////                .peek(System.out::println)
////                .max((a,b)->a-b)
////                .get();
//        System.out.println(integer);
//        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4);
//        list.parallelStream();
//
//        List<Integer> list = Arrays.asList(1, 2, 3);
//        List<Integer> list2 = list.stream()
//                .map(x -> x+2)
//                .toList();
//
//        list2.forEach(System.out::println);
        List<Integer> list2 = Stream.iterate(0, n -> n + 1)
                .limit(4)

                .map(x -> {
                    System.out.print(x + " ");
                    return x + 1;
                })

                .toList();
        System.out.println(list2);
   }
}
