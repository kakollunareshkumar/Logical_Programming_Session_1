package string_contain_only_digits;

import java.util.Scanner;

public class String_Contains_Only_Digits_Or_Not_M1 {
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
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
                //while comparing characters compiler will internally convert in to ascii table
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                count++;
//            }
//            else
//            {
//                break;
//            }
            //Manually converting character to ascii value and comparing it with passed character
            int chDigit = (int)str.charAt(i);
            //Ascii  value off 0 is 48 and ascii value of 9 is 57
            if(chDigit>=48&&chDigit<=57)
            {
                count++;
            }
        }
        //Using terinary operator
        return count == str.length() ? true : false;
    }
}
