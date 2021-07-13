package letter_count;

import java.util.Scanner;

public class Count_Occurance_Of_A_Character_M3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println("Enter character");
        char c = sc.next().charAt(0);
        System.out.println("occurance of character "+ c+" "+countOccurrences(str,c));
    }

    private static int countOccurrences(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}

