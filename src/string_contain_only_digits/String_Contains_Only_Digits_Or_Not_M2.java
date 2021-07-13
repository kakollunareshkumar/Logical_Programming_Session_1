package string_contain_only_digits;

import java.util.Scanner;

public class String_Contains_Only_Digits_Or_Not_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        if(str.isEmpty()||str.length()==0){
            System.out.println("String is empty or String length is zer0");
            System.exit(0);
        }
        if (StringContainDigitsOrNot(str)) {
            System.out.println("Passed String Contains only digits");
        } else {
            System.out.println("String contains characters other than digits");
        }
    }

    public static boolean StringContainDigitsOrNot(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
               return false;
            }
        }
        return true;
    }
}
