package letter_count;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Occurance_Of_A_Character_M5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println("Enter character");
        char c = sc.next().charAt(0);
        countOccurrences(str,c);
    }
    private static void countOccurrences(String str, char ch) {

        Map<Character,Integer> hmap = new HashMap<Character,Integer>();

        for(int i=0;i<str.length();i++)
        {
            if(hmap.containsKey(str.charAt(i)))
                hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);

            else
                hmap.put(str.charAt(i), 1);
        }

        int result = hmap.get(ch);

        System.out.println("The Character '"+ch+"' appears "+result+" times.");
    }
}
