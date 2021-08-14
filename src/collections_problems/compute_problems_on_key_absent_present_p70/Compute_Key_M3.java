package collections_problems.compute_problems_on_key_absent_present_p70;

import java.util.HashMap;
import java.util.*;
public class Compute_Key_M3 {
    public static void main(String[] args) {

/*
Syntax:
default V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
Parameters: This method accepts two parameters:
key: key with which associate the value.
remappingFunction: function to compute the value.
Returns: This method returns new value associated with the specified key, or null if none.
There are also variants of compute() method like computeIfPresent() and computeIfAbsent(),
which computes the new value only if an existing value is present or absent.

 */
                // Create a Map and add some values
                Map<String, String> map = new HashMap<>();
                map.put("Name", "Aman");
                map.put("Address", "Kolkata");

                // Print the map
                System.out.println("Map: " + map);

                // remap the values using compute() method
                map.compute("Name", (key, val)
                        -> val.concat(" Singh"));
                map.compute("Address", (key, val)
                        -> val.concat(" West-Bengal"));

                // print new mapping
                System.out.println("New Map: " + map);
            }
        }
