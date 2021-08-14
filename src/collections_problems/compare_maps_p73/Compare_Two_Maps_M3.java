package collections_problems.compare_maps_p73;

import java.util.ArrayList;
import java.util.HashMap;

public class Compare_Two_Maps_M3 {
    public static void main(String[] args) {
/*
3. Compare hashmaps for values – HashMap.values()
If we want to compare hashmaps by values i.e. two hashmaps will be equals if they have exactly same set of values.
Please note that HashMap allows duplicate values, so decide if you want to compare hashmaps with duplicate or without duplicate values.

3.1. Duplicates are NOT allowed
Add all values from HashMap.values() to an arraylist for both maps. Now compare both arraylists for equality.
 */
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

//Same values as map1
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(4, "A");
        map2.put(5, "B");
        map2.put(6, "C");

//Different values than map1 - C is added twice
        HashMap<Integer, String> map3 = new HashMap<>();

        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(4, "C");

        System.out.println( new ArrayList<>( map1.values() ).equals(new ArrayList<>( map2.values() )) );       //true
        System.out.println( new ArrayList<>( map1.values() ).equals(new ArrayList<>( map3.values() )) );   //false
    }
}
