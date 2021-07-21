package count_occurance_of_a_substring_p17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_Occurance_Of_A_SubString_M3 {
    public static void main(String[] args) {
        String str = "JavaExamplesJavaCodeJavaProgram";

        int count = 0, startIndex = 0;
        //The Pattern.LITERAL flag will ignore regular expression metacharacters and treat them as literal.
        Pattern p = Pattern.compile("Java", Pattern.LITERAL);
        Matcher m = p.matcher(str);

        while(m.find(startIndex)){
            count++;
            startIndex = m.start() + 1;
        }

        System.out.println("Total occurrences: " + count);
    }
}
