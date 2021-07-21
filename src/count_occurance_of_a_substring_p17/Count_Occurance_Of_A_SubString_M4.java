package count_occurance_of_a_substring_p17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_Occurance_Of_A_SubString_M4 {
    public static void main(String[] args) {
        String txt = "today is holiday holi";
        String pat = "holi";
        System.out.println(countFreq(pat, txt));

    }
    static int countFreq(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int res = 0;


        for (int i = 0; i <= N - M; i++) {

            int j;
            for (j = 0; j < M; j++) {
                //if character in text String and Pattern String
                //does not match continue the loop or else break the
                // inner for loop and increment outer for loop by one
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }


            if (j == M) {
                res++;   //to keep track occurance of substring
                j = 0;  //After successful match initialize j=0
            }
        }
        return res;
    }

}
