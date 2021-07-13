package letter_count;

import java.util.Scanner;

public class Count_Occurance_Of_A_Character_M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println("Enter character");
        char c = sc.next().charAt(0);
        System.out.println("occurance of character "+ c+" "+countOccurrences(str,c));
    }
    private static int countOccurrences(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
        {
            //if str contains character that we passed increment counter by 1
            if (str.charAt(i) == ch) {
                counter++;
            }
        }

        return counter;
    }

}
