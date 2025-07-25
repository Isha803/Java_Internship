import java.util.ArrayList;
import java.util.List;

public class permutation {
//    static void permutationfun(String s,StringBuilder sb, StringBuilder str, List<String> list){
//        if(s.length()== str.length()){
//            //list.add(str.toString());
//            System.out.println(str);
//        }
//        else {
//            for (int i = 0; i < sb.length(); i++) {
//                str.append(sb.charAt(i));
//                StringBuilder c= sb.deleteCharAt(i);
//                permutationfun(s,sb, str, list);
//                sb.append(c);
//            }
//        }
//    }


    // IBH
    public static void permutationfun(String s, StringBuilder str, List<List<String>> list, boolean[] visited, List<String> innerList) {
        if (str.length() == s.length()) {
            innerList.add(str.toString());
            list.add(new ArrayList<>(innerList)); // deep copy
            innerList.clear();
            return;
        }

        for (int i=0; i<s.length(); i++) {
            if (!visited[i]) {
                str.append(s.charAt(i));
                visited[i] = true;
                permutationfun(s, str, list, visited, innerList);
                visited[i] = false;
                str.deleteCharAt(str.length()-1);
            }
        }
    }
    public static void main(String[] args){
//        String s = "ab";
//        List<List<String>> list = new ArrayList<>();
//        permutationfun(s,new StringBuilder(), list, new boolean[s.length()], new ArrayList<String>());

//        System.out.println(list);

        String x = "ab"; // String pool
        String y = new String("ab");  // Heap
        String a="ab";
        y=y.intern(); // Interning the string to point to the string pool
        String z = y.intern(); //
        System.out.println(x == a);

    }
}
