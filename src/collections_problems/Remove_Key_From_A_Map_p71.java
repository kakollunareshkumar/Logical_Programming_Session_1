package collections_problems;

import java.util.HashMap;
import java.util.Map;

public class Remove_Key_From_A_Map_p71 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "postgresql");
        map.put(2, "mysql");
        map.put(3, "derby");

        String r1 = map.remove(1); // postgresql
        String r2 = map.remove(4); // null

        System.out.println(map);
        /*
        Starting with JDK 8, the Map interface was enriched with a new remove() flag method with the following signature:
        boolean remove(Object key, Object value). Using this method, we can remove an entry from a map only
        if there is a perfect match between the given key and value.
         */
        // true
        boolean r3 = map.remove(2, "mysql");

        // false (the key is present, but the values don't match)
        boolean r4 = map.remove(3, "mysql");

    }
}
