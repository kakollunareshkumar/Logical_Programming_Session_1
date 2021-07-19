package remove_duplicate_characters_from_string_p12;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
//abccbfgaa     //bfg
public class Remove_Duplicate_Characters_From_String_M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        char[] ch =str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch1:ch)
        {
            //if set does not contain the character add the character to set and append that character to String
            //Buffer
            if(!set.contains(ch1))
            {
                set.add(ch1);
                sb.append(ch1);
            }
        }
        System.out.println("After removing duplicates "+sb);

    }
}
