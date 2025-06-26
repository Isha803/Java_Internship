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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
//Recursion
class RecursionExample {
    static void revname(String name,int i){
        if(i < 0) {
            return ;
        }
        System.out.println(name.charAt(i));
        revname(name,i-1);
    }
    static int factorial(int n) {
        if (n == 0 || n == 1)  // Base case
            return 1;
        else
            return n * factorial(n - 1);  // Recursive case
    }
    //Fibonacci series
    static void fibonacci(List<Integer> list,int n,int i,int j){
        if(list.size() >= n) {
            return;
        }
        list.add(i+j);
        fibonacci(list,n,j,i+j);
    }
    //Sum of first n natural numbers
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    //Sum of Digits
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }
    //Power Calculation
    static int power(int i,int j){
        if(j==0){
            return 1;
        }
        return i*power(i,j-1);
    }
    //Count Zeros in a Number
    static int zeros(int n){
       if(n!=0 && n/10 == 0) return 0;
       if(n % 10 == 0 && n/10 <= 0) return 1;

       if (n%10 == 0) return 1+zeros(n/10);
       else return zeros(n/10);
    }
    //Palindrome Check (String)
    static void palindrome(String name,int i,int j) {
        if(i>j){
            System.out.println("Palindrome");
            return;
        }
            if (name.charAt(i) == name.charAt(j)) {
                palindrome(name, i + 1, j - 1);
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
//static void palindrome(String name, int i, int j) {
//    if (i >= j) {
//        System.out.println("Palindrome");
//        return;
//    }
//    if (name.charAt(i) != name.charAt(j)) {
//        System.out.println("Not a Palindrome");
//        return;
//    }
//    palindrome(name, i + 1, j - 1);
//}
    //Product of Array (No Loops)
    static int product(int[] arr, int n) {
        if (n == 0) return 1;
        return arr[n] * product(arr, n - 1);
    }
//    static void permutation(String str, Set<String> setstr, int l, StringBuilder sb) {
//        if (l == str.length() - 1) {
//            setstr.add(sb.toString());
//            System.out.println(sb.toString());
//            return;
//        }
//        for (int i = l; i < str.length(); i++) {
//            // Swap characters at position l and i
//            char temp = sb.charAt(l);
//            sb.setCharAt(l, sb.charAt(i));
//            sb.setCharAt(i, temp);
//
//            permutation(str, setstr, l + 1, sb);
//
//            // Backtrack (restore original string)
//            temp = sb.charAt(l);
//            sb.setCharAt(l, sb.charAt(i));
//            sb.setCharAt(i, temp);
//        }
//    }
//    static void permutation2(String str, Set<String> setstr, String ans) {
//        if (str.length() == 0) {
//            setstr.add(ans);
//            System.out.println(ans);
//            return;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            permutation2(str.substring(0, i) + str.substring(i + 1), setstr, ans + str.charAt(i));
//        }
//    }
    static void permutation(String s, List<String> list, StringBuilder str, boolean[] vis){
        // base case
        if (str.length() == s.length()) {
             list.add(str.toString());

            return;
        }

        for (int j=0; j<s.length(); j++) {
            if (vis[j]) continue;
            vis[j] = true;
            permutation(s,list, str.append(s.charAt(j)), vis);
            str.deleteCharAt(str.length()-1);
            permutation(s,list, str, vis);
            vis[j] = false;
        }
    }

    //Flatten Nested List
    //Binary Search (Recursive)

    public static void main(String[] args) {
//        System.out.println(factorial(50));
//        System.out.println(); // Output: 120
//        String myname = "Isha";
//        revname(myname,myname.length()-1);
//        List<Integer> list=new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        fibonacci(list,6,0,1);
//        System.out.println("Sum of first 5 natural numbers: " + sum(5));
//        System.out.println("Sum of digits of 12345: " + sumOfDigits(12345));
//        System.out.println("5 raised to the power 3: " + power(5, 3));
//        System.out.println("Number of zeros in 200: " + zeros(200));
//        System.out.println(list);
//        palindrome("madam", 0, "madam".length() - 1);
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println("Product of array elements: " + product(arr, arr.length - 1));
////        Set<String> setstr = new HashSet<>();
////        String str = "abc";
////        StringBuilder sb = new StringBuilder(str);
////        permutation(str, setstr, 0,sb);
////        permutation2(str,setstr, "");

        List<String> listOfStr = new ArrayList<>();
        String s = "abc";
        permutation(s, listOfStr, new StringBuilder(""), new boolean[3]);
        System.out.println("Permutations of 'abc': " + listOfStr);
    }
}