package palindrom_or_not_p11;

import java.util.stream.IntStream;

public class String_Palindrom_Or_Not {
    public static void main(String[] args) {

        String str = "ABcCBa", reverseStr = "";

        int strLength = str.length();   //6
        //Method 1
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }

        //Method 2
        String reversedString = new StringBuilder(str).reverse().toString();

        System.out.println(" String reverse using string builder "+str.equals(reversedString) +" "+reversedString);

        //Method 3
        String tempString = str.replaceAll("\\s+", "").toLowerCase();
        //None match verifies lambda expression condition we specified  should match for every element then
        //it returns  false  otherwise it will returns true if condition gets satisfied for every element.
        System.out.println(IntStream.range(0, tempString.length() / 2)   //(0,3)
                .noneMatch(ch -> tempString.charAt(ch) != tempString.charAt(tempString.length() - ch - 1)));

    }
}
