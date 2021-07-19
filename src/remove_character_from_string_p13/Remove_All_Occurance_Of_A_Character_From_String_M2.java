package remove_character_from_string_p13;

import java.util.Scanner;

public class Remove_All_Occurance_Of_A_Character_From_String_M2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);

        String s2 = str.replace(String.valueOf(ch),"");
        System.out.println("After Replacing Specified Character "+s2);

    }
}
