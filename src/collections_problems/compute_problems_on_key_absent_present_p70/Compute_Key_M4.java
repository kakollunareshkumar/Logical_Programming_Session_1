package collections_problems.compute_problems_on_key_absent_present_p70;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Compute_Key_M4 {
    public static void main(String[] args) {

        /*
        hashmap.merge(key, value, remappingFunction)
        merge() Parameters
        The merge() method takes 3 parameters:

        key - key with which the specified value is to be associated
        value - value to be associated with key, if key is already associated with any value
        remappingFunction - result to be associated with key if key is already associated with a value
         */
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "9.6.1 ");
        map.put("mysql", "5.1 5.2 5.6 ");

        BiFunction<String, String, String> jdbcUrl = String::concat;

        // 5.1 5.2 5.6 8.0
        String mySqlVersion = map.merge("mysql", "8.0 ", jdbcUrl);

        System.out.println(mySqlVersion);

        System.out.println(map);

        // create an HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        // prices.put("Shirt",400);
        System.out.println("HashMap: " + prices);

        int returnedValue = prices.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Price of Shirt: " + returnedValue);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);
    }
}
