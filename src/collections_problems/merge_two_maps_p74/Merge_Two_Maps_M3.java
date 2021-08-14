package collections_problems.merge_two_maps_p74;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge_Two_Maps_M3 {
    public static void main(String[] args) {
        /*

Stream.of() is another method from the Stream API that can be used to merge two maps in Java 9 and above:
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
// Merge the second map with the first map
        Map<String, Integer> merged = Stream.of(map1, map2)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1 + v2));

// Print new map
        System.out.println(merged);

// {A=4, B=6, C=3, D=5, F=4}
    }
}
