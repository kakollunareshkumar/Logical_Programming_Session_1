package collections_problems.compare_maps_p73;

import java.util.HashMap;

public class Compare_Two_Maps_M2 {
    public static void main(String[] args) {
/*
2. Compare two hashmaps for same keys – HashMap.keySet()
2.1. Are both hashmaps equal?
If we want to compare hashmaps by keys i.e. two hashmaps will be equals if they have exactly same set of keys,
we can use HashMap.keySet() function. It returns all the map keys in HashSet.

We can compare the hashset of keys for both maps using Set.equals() method. It returns true if the two sets have the same size,
and every element of the specified set is contained in another set.
 */

        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        //Same keys as map1
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        //Different keys than map1
        HashMap<Integer, String> map3 = new HashMap<>();

        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(3, "D");
        //We can compare hashmps by key as well.
        System.out.println( map1.keySet().equals( map2.keySet() ));  //true
        System.out.println( map1.keySet().equals( map3.keySet() ));  //false
    }
}
