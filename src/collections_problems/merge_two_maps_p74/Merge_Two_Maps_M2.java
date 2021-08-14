package collections_problems.merge_two_maps_p74;

import java.util.HashMap;
import java.util.Map;

public class Merge_Two_Maps_M2 {
    public static void main(String[] args) {
        /*

This method takes three arguments as input: key, value, and a remapping function to merge values for duplicate keys.
If the specified key is not already associated with a value or is associated with null,
the Map.merge() method associates it with the given non-null value.
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
        map2.forEach((key, value) ->
                map1.merge(key, value, (v1, v2) -> v1 + v2) );

// Print new map
        System.out.println(map1);

// {A=4, B=6, C=3, D=5, F=4}

    }
}
