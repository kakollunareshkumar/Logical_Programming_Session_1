package two_strings_are_anagrams_or_not_p18;

import java.util.Scanner;

public class Check_Two_Strings_Are_Anagrams_Or_Not_M2 {
    public static void main(String[] input)
    {
        String str1, str2;
        int n, len1, len2, i, j, found=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();

        len1 = str1.length();
        len2 = str2.length();

        if(len1 == len2)
        {
            n = len1;
            for(i=0; i<n; i++)
            {
                found = 0;
                for(j=0; j<n; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        found = 1;
                        break;
                    }
                }

            }
            if(found == 0)
            {
                System.out.print("Strings are not Anagrams");
            }
            else
            {
                System.out.print("Strings are Anagrams");
            }
        }
        else
        {
            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
        }
    }
}
