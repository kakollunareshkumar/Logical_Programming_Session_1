package string_contain_only_digits;

import java.util.Scanner;
import java.util.stream.IntStream;

public class String_Contains_Only_Digits_Or_Not_M4 {

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
        //Converting string in to integer of streams by using chars method of string
        IntStream intStream = str.chars();

        //compare each element of stream with condition Character.isDigit and every element should be compulsory a
        //digit
        //allMatch takes IntPredicate as input. Intpredicate is a functional interface and we are providing
        //implementation using lambda expressions
        return intStream.allMatch(i->Character.isDigit(i));
    }
}
