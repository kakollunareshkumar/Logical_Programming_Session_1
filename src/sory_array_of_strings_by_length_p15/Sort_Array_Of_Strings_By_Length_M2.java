package sory_array_of_strings_by_length_p15;


import java.util.Arrays;

public class Sort_Array_Of_Strings_By_Length_M2 {
    private static String[] strs = {"Hello", "How", "Are", "you", "I", "am", "Fine"};

    public static void main(String[] args) {

        System.out.println("\nOriginal unsorted Greeting: " + Arrays.toString(strs));
        sort_array_by_length(strs, "DESC");
        System.out.println("\nSorted Greeting (descending order): " + Arrays.toString(strs));
        sort_array_by_length(strs, "ASC");
        System.out.println("\nSorted Greeting (ascending order): " + Arrays.toString(strs));
    }

    public static void sort_array_by_length(String[] strs, String str) {
        if (strs == null || str== null || strs.length == 0) {
            return;
        }
        if (str.equals("ASC")) {
            Arrays.sort(strs, (String str1, String str2)
                    -> Integer.compare(str1.length(), str2.length()));
        } else if (str.equals("DESC")) {
            Arrays.sort(strs, (String str1, String str2)
                    -> (-1) * Integer.compare(str1.length(), str2.length()));
        }

    }
}


