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
        //add key-value pairs
        m.put("A", 10);
        m.put("B", 20);
        m.put("C", 30);
        m.put("D", 40);
        m.put("E", 50);
        m.put("F", 50);
        m.put("G", 30);
        m.put("H", 30);
        m.put("I", 30);
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
        System.out.println("before counting frequencies of values: " + m);
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer value:m.values()){
            if (frequencyMap.containsKey(value)){
                frequencyMap.put(value, frequencyMap.get(value) + 1);
            } else {
                frequencyMap.put(value, 1);
            }
        }
        System.out.println("Frequencies of values: " + frequencyMap);
        //most frequent value
        int max1=0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Entries in frequencyMap : " + entry);
            if (entry.getValue() > max1) {
                max1 = entry.getValue();
            }
        }
        int key=0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == max1) {
                key = entry.getKey();
            }
        }
        System.out.println("most frequent element: " + key + " with frequency: " + max1);
        int max2=0;
        for (int key2 : frequencyMap.keySet()) {
            max2 = Math.max(max2, frequencyMap.get(key2));
        }
        System.out.println("Max in frequencyMap : " + max2);
        //distinct values
        Set<Integer> distinctValues = new HashSet<>(m.values());
        System.out.println("original map: " + m);
                for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (distinctValues.contains(entry.getValue())) {
            }
            else{
                distinctValues.add(entry.getValue());
            }
        }
        System.out.println("distinct values: " + distinctValues);
        System.out.println("sort on the basis of the values associated");
        Map<String, Integer> m2=new LinkedHashMap<>();
        m2.put("a",10);
        m2.put("b",5);
        m2.put("c",20);
        m2.put("d",6);
        m2.put("e",76);
        m2.put("f",67);
        m2.put("g",5);
        Map<String, Integer> m3=new LinkedHashMap<>();
        //        for(String i:m2.keySet()){
//            min=Math.min(min,m2.get(i));
//        }
//        m3.put(,min);
        while(!m2.isEmpty()) {
        int min=Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> entry : m2.entrySet()) {
            min=Math.min(min,entry.getValue());
        }
        List<String> keysToRemove = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : m2.entrySet()) {
            if (entry.getValue() == min) {
                m3.put(entry.getKey(), entry.getValue());
                //m2.remove(entry.getKey());
                keysToRemove.add(entry.getKey());
            }
        }
        for (String key3 : keysToRemove) {
                m2.remove(key3);
        }
        }
        System.out.println(m3);
    }
}
