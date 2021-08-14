package collections_problems.merge_two_maps_p74;

import java.util.HashMap;
import java.util.Map;

public class Merge_Two_Maps_M1 {
    public static void main(String[] args) {
        /*
        The Map.putAll() method provides a quick and simple solution to merge two maps. This method copies all
        key-value pairs from the second map to the first map.

        Since a HashMap object can not store duplicate keys, the Map.putAll() method override the value of duplicate keys in
        the first map with values from the second map.
         */

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("F", 4);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 3);
        map2.put("B", 4);
        map2.put("D", 5);

        // Merge second map with first map
        map1.putAll(map2);

        // Print new map
        System.out.println(map1);   //{A=3, B=4, C=3, D=5, F=4}


    }
}
