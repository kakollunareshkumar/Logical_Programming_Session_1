package first_non_repeating_character_p2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeating_Character_M4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String input = sc.nextLine();
        System.out.println(findFirstNonRepeatingCharacter(input));
    }

    public  static Character  findFirstNonRepeatingCharacter(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch:str.toCharArray())
        {
            map.put(ch,map.containsKey(ch) ? map.get(ch)+1:1);
        }
        //
        return map.entrySet().stream().filter(x->x.getValue() ==1).findFirst().get().getKey();
//Builder Design pattern
//        Stream s = map.entrySet().stream();
//        s = s.filter(x->x.getValue()==1);
//        Optional<Character> o = s.findFirst();
//        Character ch = o.get();
//        Map.Entry<Character,Character>Character entry = (ch).getKey();
//
//        return ch1;

    }
}

/* class  Naresh{

psvm(s[] args){


}
public void m1(){

}


}
Naresh n1 = new Naresh();
n1.m1();
Naresh.m1();

 */