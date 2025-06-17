import java.util.*;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
//                ////                .peek(System.out::println)
//                   ////                .max((a,b)->a-b)
 //                    ////                .get();
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
//        List<Integer> list2 = Stream.iterate(0, n -> n + 1)
//                .limit(4)
//
//                .map(x -> {
//                    System.out.print(x + " ");
//                    return x + 1;
//                })
//
//                .toList();
//        System.out.println(list2);
        //ways to create a stream
        //1. From a collection
        List<Integer> list=Arrays.asList(76,44,34,77,86,89);
        Stream<Integer> stream=list.stream();
        //2. From an array
        Integer[] array={1, 2, 3, 4, 5};
        Stream<Integer> stream2=Arrays.stream(array);
        //3. From a stream of values or static methods
        Stream<Integer> stream3=Stream.of(1, 2, 3, 4, 5);
        //4. From a builder
        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5);
        Stream<Integer> stream4 = builder.build();
        //5. From an infinite stream, iterator
        Stream<Integer> stream5 = Stream.iterate(1000, n-> n + 1000).limit(5);
        //
        int[] array2 = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(array2);
        //Lazy evaluation example
//        List<Integer> list2=Arrays.asList(2,1,4,3,5);
//        Stream<Integer> stream6 = list2.stream().filter((Integer val)->val>=3).peek(System.out::println);
//        stream6.count(); // This will trigger the stream processing and print the values that are >= 3
//        //
        //Terminal operations
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> result = list3.stream();
                //result.forEach(x-> System.out.println(x)); // This will print each element in the list
        //Object[] array3 = result.toArray(); // Convert the stream to an array
        //System.out.println("Array: " + Arrays.toString(array3));
        //Integer[] array3 = result.toArray(Integer[]::new); // Convert the stream to an array of Integers
        //System.out.println("Array: " + Arrays.toString(array3));
//        Optional<Integer> sum=result.reduce((a,b)->a+b);
//        System.out.println("Sum:"+sum.get());
//        List<Integer> list4=result.collect(Collectors.toList());
//        System.out.println("List: " + list4);
        Optional<Integer> max=result.max(Comparator.comparingInt(a -> a));
//        max.ifPresent(x-> System.out.println("Max: "+x));
//        Optional<Integer> min=result.min((a, b) -> a - b);
//        min.ifPresent(x-> System.out.println("Min: "+x));
//        long count = result.count(); // Count the number of elements in the stream
//        System.out.println("Count: " + count);
        //System.out.println(result.anyMatch(x->x==10)); // Check if any element matches the condition
        //System.out.println(result.allMatch(x->x>0)); // Check if all elements match the condition
        //System.out.println(result.noneMatch(x->x<0)); // Check if no elements match the condition
//        Boolean anyMatch = result.peek(System.out::println).anyMatch(x -> x > 3); // Check if any element is greater than 3
//        System.out.println("Any match greater than 3: " + anyMatch);
//        result.peek(System.out::println).findFirst(); // Find the first element in the stream
//        firstElement.ifPresent(x -> System.out.println("First element: " + x));
//        Optional<Integer> anyElement = result.findAny(); // Find any element in the stream
//        anyElement.ifPresent(x -> System.out.println("Any element: " + x));
//        flatMap example
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flatList = listOfLists.stream()
                .flatMap(x-> x.stream()
                        .map(y -> y+2))
                .collect(Collectors.toList()); // Collect the results into a list
        System.out.println("Flat List: " + flatList);
//        System.out.println(list3.stream()
//                .map(x -> {
//                    System.out.println("Mapping: " + x);
//                    return x+2;
//                })
//                .collect(Collectors.toList()));

    }



}
