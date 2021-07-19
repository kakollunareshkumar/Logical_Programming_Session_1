package remove_character_from_string_p13;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Remove_All_Occurance_Of_A_Character_From_String_M3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);
        //By using filter we are checking if if passed character and element in stream are not equal.
        //converting Integerstreams to objects and collecting all the elements which does not satisfy the condition
        String result = str.chars().filter(ch1->ch1!=ch).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());  //ABC 656667
        System.out.println("After Replacing given character "+result);
    }
}
