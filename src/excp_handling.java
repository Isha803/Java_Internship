/// // Exception Handling in Java
//public class excp_handling {
//    public static void main(String[] args) {
//    //throw new ArithmeticException();
//        //throw new ClassNotFoundException();
//        try {
//            method1();
//        }catch (ClassNotFoundException obj){
//            System.out.println("Class not found exception caught");
//        }
//    }
//    public static void method1() throws ClassNotFoundException {
//        throw new ClassNotFoundException();
//    }
//}
////MULTIPLE CATCH BLOCKS
//public class excp_handling {
//    public static void main(String[] args) {
//        try {
//            method1();
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic exception caught");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Index out of Bound exception caught");
//        }catch (Exception e) {
//            System.out.println("Some other exception caught: " + e.getMessage());
//        }
//        try{
//            int[] arr2 = new int[5];
//            arr2[10] = 100;
//        }catch (ArithmeticException e) {
//            System.out.println("Arithmetic exception caught");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Index out of Bound exception caught");
//        }catch (Exception e) {
//            System.out.println("Some other exception caught: " + e.getMessage());
//        }
//        try{
//            int[] arr3 = new int[5];
//            arr3[10] = 100;
//        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println("Arithmetic or Array index out of Bound exception caught");
//        }catch (Exception e) {
//            System.out.println("Some other exception caught: " + e.getMessage());
//        }finally{
//            System.out.println("Finally block executed");
//        }
//    }
//
//    public static void method1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
//        int[] arr = new int[5];
//        arr[10] = 100/0;
//    }
//}
////Re-Throwing Exception
//public class excp_handling {
//    public static void main(String[] args)throws ArithmeticException {
//        try {
//            method1();
//        } catch (ArithmeticException e) {
//            throw e; // Re-throwing the exception
//        }
//    }
//
//    public static void method1() throws ArithmeticException{
//        throw new ArithmeticException();
//    }
//}
////Custom Exception Handling
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class excp_handling {
    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }

    public static void method1() throws CustomException {
        throw new CustomException("This is a custom exception message");
    }
}