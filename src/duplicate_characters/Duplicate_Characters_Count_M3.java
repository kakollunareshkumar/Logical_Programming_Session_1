package duplicate_characters;//1. Counting duplicate characters: Write a program that counts duplicate
//characters from a given string.
//3 techniques  solved by using built in functions
//Assignment for you is to solve the same program with out using built in functions

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Duplicate_Characters_Count_M3 {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String input = sc.nextLine();
        countDuplicateCharacters(input);
    }
    //Antoher Java 8 concept from streams
    public static  void countDuplicateCharacters(String str)
    {
        //Step-1   invoke the chars method on the String returns intStream instance
        IntStream  intStream = str.chars();
        //Step-2 Convert Integer Stream to objects by using mapToObj() method
        Stream<Character> characterStream =  intStream.mapToObj(ch->(char)ch);
        //Step-3 Group objects by Collectors.groupingBy method and count each object by using collectors.counting method
        Map<Character, Long> out = characterStream.collect(Collectors.groupingBy(ch->ch, Collectors.counting()));
        System.out.println(out);
    }

}
