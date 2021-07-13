package count_vowels_characters;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Count_Vowels_Characters_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        if(str.isEmpty()||str.length()==0){
            System.out.println("String is empty or String length is zer0");
            System.exit(0);
        }
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        String strl = str.toLowerCase();
        IntStream intStream = strl.chars();
        Map<Boolean,Long> map = intStream.mapToObj(ch->(char)ch).filter(ch->(ch>='a'&&ch<='z'))
                .collect(Collectors.partitioningBy(ch->vowels.contains(ch), Collectors.counting()));
        System.out.println("total vowels count "+map.get(true));
        System.out.println("total constant count "+map.get(false));

    }
}
