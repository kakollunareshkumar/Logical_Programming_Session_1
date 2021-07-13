package letter_count;

import java.util.Scanner;

public class Count_Occurance_Of_A_Character_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println("Enter character");
        char c = sc.next().charAt(0);
        System.out.println("occurance of character "+ c+" "+countOccurrences(str,c));
    }
//abcabc-->str     c-->ch
//if the string character at particular position and character we passed are same do a count and return that
//count
    //97 ==97
    private static long countOccurrences(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
