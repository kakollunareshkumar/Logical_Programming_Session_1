package collections_problems.compute_problems_on_key_absent_present_p70;

import java.util.HashMap;

public class Compute_Key_M2 {
    public static void main(String[] args) {
/*
Syntax:
public V computeIfAbsent(K key, Function<? super K, ? extends V> remappingFunction)
Parameters: This method accepts two parameters:
key : key for which we want to compute value using mapping.
remappingFunction : function to do the operation on value.
Returns: This method returns current (existing or computed) value associated with the specified key, or null if mapping returns null.
 */

        // create an HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 180);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        // mapping for Shoes is already present
        // new value for Shoes is not computed
        int shoePrice = prices.computeIfAbsent("Shoes", (key) -> 280);
        System.out.println("Price of Shoes: " + shoePrice);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);


        // compute the value of Shirt because key is not present in hashmap
        int shirtPrice = prices.computeIfAbsent("Shirt", key -> 280);
        System.out.println("Price of Shirt: " + shirtPrice);


        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);
    }
}
