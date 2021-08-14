package collections_problems.compute_problems_on_key_absent_present_p70;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Compute_Key_M1 {
    public static void main(String[] args) {
/*
        computeIfPresent() method
        key: key with which the value is to be associated.
        remappingFunction: function to do the operation on value.
        Returns: This method returns new remapped value associated with the specified key, or null if mapping returns null.
 */

        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1");
        map.put("mysql", "192.168.0.50");

        BiFunction<String, String, String> jdbcUrl = (k, v) -> "jdbc:" + k + "://" + v + "/customers_db";
        //key which is present in map
        String mySqlJdbcUrl = map.computeIfPresent("mysql", jdbcUrl);

        System.out.println(mySqlJdbcUrl);

        //Key which is not present in map
       /* if we try the same computation for an entry that doesn't exist (for example, voltdb), then the returned
        value will be null and the map remains untouched */
        // null
        String oldDbJdbcUrl = map.computeIfPresent("voltdb", jdbcUrl);
        System.out.println(oldDbJdbcUrl);
    }
}
