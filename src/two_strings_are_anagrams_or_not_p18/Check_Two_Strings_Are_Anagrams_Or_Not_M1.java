package two_strings_are_anagrams_or_not_p18;
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase
// typically using all the original letters exactly once
//tops <-> pots
//act <-> cat
// sea<-> aes

import java.util.Arrays;

public class Check_Two_Strings_Are_Anagrams_Or_Not_M1 {
    public static void main (String [] args) {
        String str1="tops";
        String str2="pots";

        //Converting both the string to lower case.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Checking for the length of strings  and if the string lengths not equal then print
        //Strings are not anagrams.
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        }
        else {
            //Converting both the arrays to character array
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //Sorting the arrays using in-built function sort ()
            Arrays.sort(string1);
            Arrays.sort(string2);
            //Comparing both the arrays using in-built function equals ()
            if(Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}
