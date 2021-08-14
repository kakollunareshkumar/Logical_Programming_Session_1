package collections_problems.compute_problems_on_key_absent_present_p70;

import java.util.HashMap;

public class Compute_Key_M5 {
    public static void main(String[] args) {

        /*
       hashmap.putIfAbsent(K key, V value)
       returns the value associated with the key, if the specified key is already present in the hashmap
       returns null, if the specified key is already not present in the hashmap
         */

        // create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        // add mappings to HashMap
        languages.put(1, "Python");
        languages.put(2, "C");
        languages.put(3, "Java");
        System.out.println("Languages: " + languages);

        // key already not present in HashMap
        languages.putIfAbsent(4, "JavaScript");

        // key already present in HashMap
        languages.putIfAbsent(2, "Swift");
        System.out.println("Updated Languages: " + languages);
    }
}
