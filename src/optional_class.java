import java.util.Optional;
public class optional_class {
    public static void main(String[] args) {
        Optional<String> name=getName(2);
//        if(name.isPresent()){
//            System.out.println("Name is: " + name.get());
//        } else {
//            System.out.println("Name not found");
//        }
//        name.ifPresent(x-> System.out.println("Name is: " + x));//method reference can be used instead of lambda
//        name.ifPresentOrElse(
//            x -> System.out.println("Name is: " + x),
//            () -> System.out.println("Name not found")
//        );
        //name.orElse("Default Name");
        //name.orElseGet(()->"Default Name");
        //name.orElseThrow(()->new RuntimeException("Name not found"));
        //String name1 = name.orElse("Not Found");//orElseGet,orElseThrow
        //System.out.println(name1);
        Optional<String> name1 = getName(2);
        Optional<String> name2=name1.map(x-> x.toUpperCase());
        System.out.println(name2);
        System.out.println(name1);
    }
    private static Optional<String> getName(int id){
        //String name="Venessa";
        //String name=null;
        //return Optional.ofNullable(name);
        //return Optional.empty();
        return Optional.of("Venessa");
    }
}
