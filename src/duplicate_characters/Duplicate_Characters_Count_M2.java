package duplicate_characters;//1. Counting duplicate characters: Write a program that counts duplicate
//characters from a given string.
//3 techniques  solved by using built in functions
//Assignment for you is to solve the same program with out using built in functions

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate_Characters_Count_M2 {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String input = sc.nextLine();
        countDuplicateCharacters(input);
    }
    public static  void countDuplicateCharacters(String str)
    {
       //Compute

        Map<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<str.length();i++)
        {
            char c =  str.charAt(i);
            //terinary operator
            hmap.compute(c,(key,value)-> (value == null)? 1:value+1);

            //a = Expression1 ? Expression2: Expression3
            //a = (4>5) ? true: false
        }
        System.out.println(hmap);

    }

}
