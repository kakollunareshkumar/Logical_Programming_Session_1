package remove_duplicate_characters_from_string_p12;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicate_Characters_From_String_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        //converting str to IntStream objects and collecting each character uniquely and we are looping through
        //each character or element  and appending the element to String Buffer and while appending we are
        //converting from Integer objects to character objects
        str.chars().distinct().forEach(ch1-> sb.append((char)ch1));
        System.out.println("After removing duplicates "+sb);

    }
}
