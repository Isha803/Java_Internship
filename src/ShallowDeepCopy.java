//public class ShallowDeepCopy {
//    public static void main(String[] args) {
//        // Example of shallow copy
//        int[] originalArray = {1, 2, 3, 4, 5};
//        int[] shallowCopy = originalArray; // Shallow copy
//        shallowCopy[0] = 10; // Modifying the shallow copy
//        System.out.println("Original Array after shallow copy modification: " + originalArray[0]); // Output: 10
//        System.out.println("Shallow Copy: " + shallowCopy[0]); // Output: 10
//        // Example of deep copy
//        int[] deepCopy = originalArray.clone(); // Deep copy
//        deepCopy[0] = 20; // Modifying the deep copy
//        System.out.println("Original Array after deep copy modification: " + originalArray[0]); // Output: 10
//        System.out.println("Deep Copy: " + deepCopy[0]); // Output: 20
//    }
//}
// Java program to illustrate the difference between shallow
// and deep copy
//import java.util.ArrayList;

// Class of Car
//class Car {
//    public String name;
//    public ArrayList<String> colors;
//
//    public Car(String name, ArrayList<String> colors)
//    {
//        this.name = name;
//        this.colors = colors;
//    }
//}
//
//public class ShallowDeepCopy {
//    public static void main(String[] args)
//    {
//        // Create a Honda car object
//        ArrayList<String> hondaColors = new ArrayList<>();
//        hondaColors.add("Red");
//        hondaColors.add("Blue");
//        Car honda = new Car("Honda", hondaColors);
//
//        // Deep copy of Honda
//        Car deepcopyHonda = new Car(
//                honda.name, new ArrayList<>(honda.colors));
//        deepcopyHonda.colors.add("Green");
//        System.out.print("Deepcopy: ");
//        for (String color : deepcopyHonda.colors) {
//            System.out.print(color + " ");
//        }
//        System.out.println("\nOriginal: ");
//        for (String color : honda.colors) {
//            System.out.print(color + " ");
//        }
//        System.out.println();
//
//        // Shallow Copy of Honda
//        Car copyHonda = honda;
//        copyHonda.colors.add("Green");
//        System.out.print("Shallow Copy: ");
//        for (String color : copyHonda.colors) {
//            System.out.print(color + " ");
//        }
//        System.out.println("\nOriginal: ");
//        for (String color : honda.colors) {
//            System.out.print(color + " ");
//        }
//        System.out.println();
//    }
//}

//Recursion
class RecursionExample {
    static int factorial(int n) {
        if (n == 0 || n == 1)  // Base case
            return 1;
        else
            return n * factorial(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}