//interface emp{
//    int getid();
//    String getname();
//}
//public class anonymous {
//    public static void main(String[] args) {
//        emp e=new emp() {
//            @Override
//            public int getid() {
//                return 23;
//            }
//
//            @Override
//            public String getname() {
//                return "Steve";
//            }
//        };
//        System.out.println(e.getid());
//        System.out.println(e.getname());
//    }
//}
@FunctionalInterface
interface emp{
    String getname();
}
public class anonymous {
    public static void main(String[] args) {
        emp2 obj=new emp2();
        obj.fun();
    }

    static class emp2 {
        int c = 20;

        void fun() {
            //int a=20;
            emp e = () -> {
                int a = 30;
                System.out.println(a);
                System.out.println(this.c);
                return "hello";
            };
            System.out.println(e.getname());
            emp e2 = new emp() {
                int b = 40;

                @Override
                public String getname() {
                    System.out.println(this.b);
                    return "hi";
                }
            };
            System.out.println(e2.getname());
        }
    }
}