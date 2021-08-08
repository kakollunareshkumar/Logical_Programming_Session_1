package first_non_repeating_character_p2;

import java.util.Scanner;

public class First_Non_Repeating_Character_M3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();

        boolean found = false;
        for(int i=0; i<str.length();i++)
        {
            found  = true;
            char c  = str.charAt(i);

            for(int j=0; j<str.length();j++)
            {
                //System.out.println("character at J position "+str.charAt(j));
                //if found then  set the boolean field as false
                //Also skip the character which is compared
                if(c==str.charAt(j)&&j!=i){
                    found = false;
                    break;
                }

            }
            if(found){
                System.out.println(" Non repeating character is "+c);
                break;
            }
        }

    }
}
