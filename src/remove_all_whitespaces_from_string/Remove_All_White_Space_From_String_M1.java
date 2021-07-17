package remove_all_whitespaces_from_string;

import java.util.Scanner;

public class Remove_All_White_Space_From_String_M1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string to remove white spaces");

        String str = sc.nextLine();
        //Replace all spaces with empty string
        String stringWithoutSpaces = str.replaceAll("\\s+", "");

        System.out.println("Input String : " + str);

        System.out.println("Input String Without Spaces : " + stringWithoutSpaces);

        sc.close();

    }
}