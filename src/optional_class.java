import java.util.Optional;
public class optional_class {
    public static void main(String[] args) {
        Optional<String> name=getName(2);
        if(name.isPresent()){
            System.out.println("Name is: " + name.get());
        } else {
            System.out.println("Name not found");
        }
        name.ifPresent(x-> System.out.println("Name is: " + x));//method reference can be used insteaf
    }
    private static Optional<String> getName(int id){
        String name="Venessa";
        //String name=null;
        return Optional.ofNullable(name);
        //return Optional.empty();
    }
}
