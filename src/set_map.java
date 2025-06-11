import java.util.*;;
public class set_map {
    public static void main(String[] args) {
        System.out.println("using Set in Java");
         Set<Integer> s = new HashSet<>();
         s.add(10);
         s.add(20);
         s.add(30);
         s.add(40);
         s.add(50);
         s.add(20); // Duplicate, will not be added
         System.out.println(s);
         System.out.println(s.contains(20));
         System.out.println(s.size());
         s.remove(20);
         System.out.println(s);
         for(Integer i:s){
             System.out.println(i);
         }
         /// //////////union
            Set<Integer> s2 = new HashSet<>();
            s2.add(50);
            s2.add(60);
            s2.add(70);
            s2.add(10);
            s2.add(20);
            Set<Integer> unionSet = new HashSet<>(s);
            for (Integer i : s) {
                unionSet.add(i);
            }
            for (Integer i : s2) {
                unionSet.add(i);
            }
        System.out.println("Set 1: " + s);
        System.out.println("Set 2: " + s2);
        System.out.println("Union: " + unionSet);
        /// /////////intersection
            Set<Integer> intersectionSet = new HashSet<>();
            for (Integer i : s) {
                if (s2.contains(i)) {
                    intersectionSet.add(i);
                }
            }
        System.out.println("Set 1: " + s);
        System.out.println("Set 2: " + s2);
        System.out.println("Intersection: " + intersectionSet);
        /// ///////difference
            Set<Integer> differenceSet = new HashSet<>();
            for (Integer i : s) {
                if (!s2.contains(i)) {
                    differenceSet.add(i);
                }
            }
        System.out.println("Set 1: " + s);
        System.out.println("Set 2: " + s2);
        System.out.println("Difference: " + differenceSet);
        /// ////////disjoint
            boolean isDisjoint = true;
            for (Integer i : s) {
                if (s2.contains(i)) {
                    isDisjoint = false;
                    break;
                }
            }
        System.out.println("Set 1: " + s);
        System.out.println("Set 2: " + s2);
        System.out.println("Are the sets disjoint? " + isDisjoint);
        /// ///////////checking subset
            boolean isSubset = true;
            for (Integer i : s) {
                if (!s2.contains(i)) {
                    isSubset = false;
                    break;
                }
            }
        System.out.println("Set 1: " + s);
        System.out.println("Set 2: " + s2);
        System.out.println("Is Set 1 a subset of Set 2? " + isSubset);

        /// ///////////map
        System.out.println("\nusing Map in Java");
        Map<String, Integer> m = new HashMap<>();
        m.put("A", 10);
        m.put("B", 20);
        m.put("C", 30);
        m.put("D", 40);
        m.put("E", 50);
        m.put("F", 50);
        System.out.println(m);
        m.put("C", 35); // Update value for key "C"
        System.out.println("after update:"+m);
        m.remove("B"); // Remove key "B")
        System.out.println("after removal:"+m);
        System.out.println("C "+m.get("C"));
        // Iterating through the map
//        for (Map.Entry<String, Integer> entry : m.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
        m.forEach((k, v)
                -> System.out.println(k + " : "
                + v));
        // Checking if a key exists
        System.out.println("Contains key 'A': " + m.containsKey("A"));
        //counting frequencies of values
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        m.forEach((k, v) -> {
//            int i=1;
//            if (m.containsValue(v)) {
//            frequencyMap.put(v, i );
//            i++;
//        }
//        });
//        System.out.println("Frequencies of values: " + frequencyMap);

    }
}
