import java.util.*;
class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public class ArrayLists {
    public static void main(String[] args){
//        ArrayList<String> a1=new ArrayList<>();
//        ArrayLists a=new ArrayLists();
//            /// //////////using add function
//            System.out.println("--------addition---------");
//            a1.add("heyy");
//            a1.add("hello");
//            a1.add("hi");
//        System.out.println(a1);
//            /// ///////////using remove function
//            System.out.println("------removal----------");
//            a1.remove("heyy");
//            a1.remove(0);
//        System.out.println(a1);
//            /// //////////using set function
//            System.out.println("-------changing value-------");
//            a1.set(0,"hey");
//        System.out.println(a1);
//        /// //////////access using index using get function
//            System.out.println("value at 1:"+a1.get(0));
//        /// //////////using add function
//        System.out.println("--------addition---------");
//        a1.add("heyy");
//        a1.add("hello");
//        a1.add("hi");
//        System.out.println(a1);
//        /// ///////////size
//        System.out.println("size:"+a1.size());
//        /// //////checking the existence
//        System.out.println("hello exists?:"+a1.contains("hello"));
//        /// ////////sorting
//        Collections.sort(a1);
//        System.out.println("after sorting:"+a1);
//        /// ////////////reverse
//        Collections.reverse(a1);
//        System.out.println("reversing:"+a1);
//        /// //////////////merging
//        ArrayList<String> a2=new ArrayList<>();
//        a2.add("red");
//        a2.add("red");
//        a2.add("orange");
//        a1.addAll(a2);
//        System.out.println("after merging:"+a1);
//    /////////////////Copy ArrayList
//    ArrayList<String> a3=new ArrayList<>(a2);
//        System.out.println("copying from a2 to a3:"+a3);
//
//        ////////////Count Duplicates
//        int j=0;
//        for(int i=0;i< a1.size();i++){
//            if(a1.get(i).equals("red")){
//                j++;
//            }
//        }
//        System.out.println("occurrence of red in a1:"+j);
//        ArrayList<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(1, "Alice"));
//        studentList.add(new Student(2, "Bob"));
//        studentList.add(new Student(3, "Charlie"));
//        // Access individual student
//        Student secondStudent = studentList.get(1);
//        System.out.println("Second Student details: " + secondStudent.getName()+","+secondStudent.getId());
//
//        /// ////////////////////////integer arraylist///////////////////////////
//        System.out.println("-----------integer arraylist-------------");
//        ArrayList<Integer> i1=new ArrayList<>();
//        /// ///////add
//        i1.add(43);
//        i1.add(4);
//        i1.add(3);
//        System.out.println("after addition:"+i1);
//        /// ////////sum
//        int sum=0;
//        for(int i=0;i<i1.size();i++){
//            sum+=i1.get(i);
//        }
//        System.out.println("sum:"+sum);
//        /// //////max, min
//        System.out.println("max:"+Collections.max(i1));
//        System.out.println("min:"+Collections.min(i1));
//        /// //////search
//        int search=4;
//        int flag=0;
//        for(int i=0;i<i1.size();i++){
//            if(i1.get(i).equals(search)){
//                System.out.println(search+" found at:"+i);
//                flag=1;
//            }
//            if (flag==0){
//                System.out.println("not found");
//            }
//        }
//        /// //////remove
//        int remove=4;
//        for(int i=0;i<i1.size();i++){
//            if(i1.get(i).equals(remove)){
//               i1.remove(i);;
//            }
//        }
//        System.out.println("after removal:"+i1);
//        /// ///////print in reverse
//        System.out.println("printing elements in reverse order:");
//        for(int i=i1.size()-1;i>=0;i--){
//            System.out.print(i1.get(i)+"\t");
//        }
//        /// ///////insert
//        System.out.println("\ninserting element 4:-");
//        i1.add(1,4);
//        System.out.println(i1);
//        /// /////////rotate
//        System.out.println("enter no. of right rotations to be performed:");
//        Scanner sc=new Scanner(System.in);
//        int z=sc.nextInt();
//        for(int m=1;m<=z;m++) {
//
//            int x = i1.get(i1.size()- 1);
//            for (int k = i1.size()- 1; k >= 0; k--) {
//                if (k == i1.size() - 1) {
//                } else {
//                    i1.set(k+1,i1.get(k));
//                }
//            }
//            i1.set(0,x);
//            System.out.println("after rotation number:"+m);
//            System.out.println(i1);
//        }
          /// ///////////adjacency list
        // for each loop
        //int[] temp = {1, 2, 3, 4, 5};
        //for (int i : temp) System.out.print(i + " ");
        List<int[]> li =new ArrayList<>();
       int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=1;
        }
        li.add(arr);
        li.add(arr);
        li.add(arr);
        li.add(arr);
        System.out.println("list of array of integers");
        for (int[] i: li){
            for(int j=0;j<i.length;j++){
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
        List<String[]> li2 =new ArrayList<>();
        String arr4[]=new String[3];
        for(int i=0;i<3;i++){
            arr4[i]="hi";
        }
        li2.add(arr4);
        li2.add(arr4);
        li2.add(arr4);
        li2.add(arr4);
        System.out.println("list of array of strings");
        for (String[] i: li2){
            for(int j=0;j<i.length;j++){
                System.out.print(arr4[j]+"\t");
            }
            System.out.println();
        }
        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(1);
        arr3.add(1);
        list2.add(arr3);
        list2.add(arr3);
        list2.add(arr3);
        list2.add(arr3);
        list2.add(arr3);
        System.out.println("List of list of integers: ");
        System.out.println(list2);
        List<List<String>> list3 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        arr2.add("hi");
        arr2.add("hi");
        arr2.add("hi");
        list3.add(arr2);
        list3.add(arr2);
        list3.add(arr2);
        list3.add(arr2);
        list3.add(arr2);
        System.out.println("List of list of strings: ");
        System.out.println(list3);

    }
}
