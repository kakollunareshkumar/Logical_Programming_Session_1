package duplicate_characters;//1. Counting duplicate characters: Write a program that counts duplicate
//characters from a given string.
//3 techniques  solved by using built in functions
//Assignment for you is to solve the same program with out using built in functions

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate_Characters_Count {

    public static void main(String[] args) {

        Scanner  sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String input = sc.nextLine();
        countDuplicateCharacters(input);
    }
    public static  void countDuplicateCharacters(String str)
    {
        //Logic to implement count duplicate characters
        //Hashmap is based on keys and values
        //Never code to classes directly  and always use interfaces and provide implementation for interfaces
        Map<Character,Integer> hmap=new HashMap<>();

        for (int i=0;i<str.length();i++)
        {
            //String is a combination of characters

            char c = str.charAt(i);

            //If  character  already exists in hashmap get the character from hashmap and increment value by 1
            if(hmap.containsKey(c))
            {
                hmap.put(c,hmap.get(c)+1);
            }
            else    //If specified character is not present then insert that particulat charcater in hashmap with value 1
            {
                hmap.put(c,1);
            }

        }
        System.out.println(hmap);

    }

}
