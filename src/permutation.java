import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

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
    public static void powerSetFun(String s, Set<Set<Character>> powerSet, Set<Character> innerSet, boolean[] visited){
        if(innerSet.size()==s.length()){
            powerSet.add(new HashSet<>(innerSet));
            return;
        }
        powerSet.add(new HashSet<>(innerSet));
        for(int i=0;i<s.length();i++) {
            if (!visited[i]) {
                visited[i] = true;
                innerSet.add(s.charAt(i));
                powerSetFun(s, powerSet, innerSet, visited);
                innerSet.clear();
                visited[i] = false;
            }
        }
    }
    public static void climbingStairs(int totalSteps,List<List<Integer>> outterlist,List<Integer> innerlist){
        int sumOfSteps=0;
        for(int i:innerlist){
            sumOfSteps=sumOfSteps+i;
        }
        if(sumOfSteps==totalSteps){
            outterlist.add(new ArrayList<>(innerlist));
            return;
        }
        else if (sumOfSteps>totalSteps) {
            return;
        }
           innerlist.add(1);
           climbingStairs(totalSteps,outterlist,innerlist);
           innerlist.remove(innerlist.size()-1);
           innerlist.add(2);
           climbingStairs(totalSteps,outterlist,innerlist);
           innerlist.remove(innerlist.size()-1);
    }
    public static void subsetSum(int totalSum,List<List<Integer>> outterlist,List<Integer> innerlist,List<Integer> givenSet,int n, boolean[] visited, int sum) {
        if (sum == totalSum) {
            outterlist.add(new ArrayList<>(innerlist));
            return;
        }

        if (n >= givenSet.size() || sum > totalSum) {
            return;
        }
//        int sumOfSubset = 0;
//        for (int i : innerlist) {
//            sumOfSubset = sumOfSubset + i;
//        }

//
//            //take
//            innerlist.add(givenSet.get(n));
//            subsetSum(totalSum, outterlist, innerlist, givenSet,n+1);
//
//            //skip
//            innerlist.remove(innerlist.size() - 1);
//            subsetSum(totalSum, outterlist, innerlist, givenSet, n+1);

        for (int i = n; i < givenSet.size(); i++) {
            if (!visited[i]){
            visited[i]=true;
            innerlist.add(givenSet.get(i));
            sum += givenSet.get(i);
            subsetSum(totalSum, outterlist, innerlist, givenSet, i+1, visited, sum);
            sum -= givenSet.get(i);
            innerlist.remove(innerlist.size()-1);
            visited[i]=false;
            }
        }
    }
    public static void main(String[] args){
//        String s = "abc";
//        List<List<String>> list = new ArrayList<>();
//        permutationfun(s,new StringBuilder(), list, new boolean[s.length()], new ArrayList<String>());

//        System.out.println(list);

//        String x = "ab"; // String pool
//        String y = new String("ab");  // Heap
//        String a="ab";
//        y=y.intern(); // Interning the string to point to the string pool
//        String z = y.intern(); //
//        System.out.println(x == a);

//        Set<Set<Character>> pset=new HashSet<>();
//        Set<Character> iset=new HashSet<>();
//        String s="abc";
//        powerSetFun(s,pset,iset, new boolean[s.length()]);
//        System.out.println(pset);

//        List<Integer> il=new ArrayList<>();
//        List<List<Integer>> ol=new ArrayList<>();
//        climbingStairs(4,ol,il);
//        System.out.println(ol);


        List<Integer> il=new ArrayList<>();
        List<List<Integer>> ol=new ArrayList<>();
        List<Integer> givenSet=Arrays.asList(10,20,30,40,50);
        boolean[] vis = new boolean[givenSet.size()];
        subsetSum(50,ol,il,givenSet,0, vis, 0);
        System.out.println(ol);
    }
}
