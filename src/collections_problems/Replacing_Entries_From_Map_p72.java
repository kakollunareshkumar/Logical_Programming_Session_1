package collections_problems;

import java.util.HashMap;

public class Replacing_Entries_From_Map_p72 {
    public static void main(String[] args) {
        /*
        The replace(K key, V value) method of Map interface, implemented by HashMap class is used to replace
        the value of the specified key only if the key is previously mapped with some value.
Syntax:
public V replace(K key, V value)

Parameters: This method accepts two parameters:
key: which is the key of the element whose value has to be replaced.
value: which is the new value which has to be mapped with the provided key.
Return Value: This method returns the previous value associated with the specified key. If there is no such key mapped,
then it returns null, if the implementation supports null value.
         */

        // create an HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        // add entries to HashMap
        languages.put(1, "Python");
        languages.put(2, "English");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        // replace mapping for key 2
        String value = languages.replace(2, "Java");

        System.out.println("Replaced Value: " + value);
        System.out.println("Updated HashMap: " + languages);

        // create an HashMap
        HashMap<String, String> countries = new HashMap<>();

        // insert items to the HashMap
        countries.put("Washington", "America");
        countries.put("Ottawa", "Canada");
        countries.put("Canberra", "Australia");
        System.out.println("Countries:\n" + countries);

        // replace mapping {Washington = America}
        countries.replace("Washington", "America", "USA");  // return true

        countries.replace("Canberra", "New Zealand", "Victoria");  // return false

        System.out.println("Countries after replace():\n" + countries);

        //Replace All method
/*

hashmap.replaceAll(Bifunction<K, V> function)
Here, hashmap is an object of the HashMap class.

replaceAll() Parameters
The replaceAll() method takes a single parameter.

function - operations to be applied to each entry of the hashmap
replaceAll() Return Value
The replaceAll() method does not return any values. Rather,
it replaces all values of the hashmap with new values from function.

 */

        // create an HashMap
        HashMap<Integer, String> languages1 = new HashMap<>();

        // add entries to the HashMap
        languages.put(1, "Telugu");
        languages.put(2, "Hindi");
        languages.put(3, "English");
        System.out.println("HashMap: " + languages);

        // Change all value to uppercase
        languages.replaceAll((key, value1) -> value1.toUpperCase());
        System.out.println("Updated HashMap: " + languages);


    }
}
