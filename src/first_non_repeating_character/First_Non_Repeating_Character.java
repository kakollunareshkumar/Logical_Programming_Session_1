package first_non_repeating_character;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String input = sc.nextLine();
        System.out.println(findFirstNonRepeatingCharacter(input));

    }

    public  static Object findFirstNonRepeatingCharacter(String str){
        //Compute or calculate keys and its associated values
        Map<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<str.length();i++) {
            char c = str.charAt(i);
            //terinary operator
            hmap.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
        }
        //Get the key from hashmap for first character when  it's value is 1
        for(Map.Entry<Character,Integer> entry: hmap.entrySet()){

            if(entry.getValue() ==1)
            {
                return  entry.getKey();
            }
        }
        //if no string is passed return min-value of character
        return  -1;
    }
}
