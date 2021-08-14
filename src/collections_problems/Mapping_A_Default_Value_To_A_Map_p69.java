package collections_problems;

import java.util.HashMap;
import java.util.Map;

public class Mapping_A_Default_Value_To_A_Map_p69 {
    public static void main(String[] args) {

        /*
        Starting with JDK 8, the solution to this problem consists of a simple invocation of the Map.getOrDefault() method
         */

        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1:5432");
        map.put("mysql", "192.168.0.50:3306");
        map.put("cassandra", "192.168.1.5:9042");
        System.out.println(map);

        //returns null
        map.get("derby");

        // 69:89.31.226:27017
        String hp1 = map.getOrDefault("derby", "69:89.31.226:27017");
        System.out.println(hp1);

        // 192.168.0.50:3306
        String hp2 = map.getOrDefault("mysql", "69:89.31.226:27017");
        System.out.println(hp2);

        /*
        Note that returning the default value doesn't mean that this value will be added to the Map. Map remains unmodified
         */
    }
}
