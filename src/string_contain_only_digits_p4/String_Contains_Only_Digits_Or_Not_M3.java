package string_contain_only_digits_p4;

import java.util.Scanner;

public class String_Contains_Only_Digits_Or_Not_M3 {
    //0 to 9 any digit should occur minimum one or more times
    private static final String REGEXPATTERN = "[0-9]+";

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
        //Using matches method internally it is calling Pattern.matches concept in regexp tutorial
        return  str.matches(REGEXPATTERN);

    }
}
