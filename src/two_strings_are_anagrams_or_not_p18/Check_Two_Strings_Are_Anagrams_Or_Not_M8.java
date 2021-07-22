package two_strings_are_anagrams_or_not_p18;

import java.util.Scanner;

public class Check_Two_Strings_Are_Anagrams_Or_Not_M8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Getting the input string from the user
        System.out.print("Enter the First String : ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second String : ");
        String s2 = scanner.nextLine();

        if (checkAnagram(s1, s2))
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        else
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams");

        scanner.close();
    }

    public static boolean checkAnagram(String s1, String s2)
    {
        // Remove all the white space, convert to lower case & character array
        char[] arr1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (arr1.length != arr2.length)
            return false;
        // int array to hold value for 26 alphabets
        int[] value = new int[26];
        for (int i = 0; i < arr1.length; i++)
        {
            // Increment the value at index i by 1
            value[arr1[i] - 97]++;
            // Decrement the value at index i by 1
            value[arr2[i] - 97]--;
        }
        // Value array will have only zeros, if strings are anagram
        for (int i = 0; i < 26; i++)
            if (value[i] != 0)
                return false;
        return true;
    }
}
