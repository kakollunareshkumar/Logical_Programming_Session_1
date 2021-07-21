package count_occurance_of_a_substring_p17;

public class Count_Occurance_Of_A_SubString_M2 {
    public static void main(String[] args) {
        String str = "JavaExamplesJavaCodeJavaProgram";
        //Divide str as many times as possible when limit is -1 and after remove no of occurance of
        //substring-1 to get actual occurance of substring in main string.
        int count = ( str.split("Java", -1).length )-1;

        System.out.println("Total occurrences: " + count);
    }
}
