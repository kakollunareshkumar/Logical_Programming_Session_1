package first_non_repeating_character_p2;

import java.util.Scanner;

public class First_Non_Repeating_Character_M2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String input = sc.nextLine();
        findFirstNonRepeatingCharacter(input);
    }

    public  static void findFirstNonRepeatingCharacter(String str) {
//hello

        for(char ch: str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character is " + ch);
                break;
            }
        }
    }
}
