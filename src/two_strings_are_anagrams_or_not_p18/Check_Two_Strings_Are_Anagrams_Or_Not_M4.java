package two_strings_are_anagrams_or_not_p18;

import java.util.*;

public class Check_Two_Strings_Are_Anagrams_Or_Not_M4 {
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
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length())
            return false;

        List<Character> list1 = new ArrayList<Character>();
        List<Character> list2 = new ArrayList<Character>();

        for (int i = 0; i < s1.length(); i++)
        {
            list1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++)
        {
            list2.add(s2.charAt(i));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.equals(list2))
            return true;
        else
            return false;
    }
}
