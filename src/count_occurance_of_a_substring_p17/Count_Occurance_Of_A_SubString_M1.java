package count_occurance_of_a_substring_p17;

public class Count_Occurance_Of_A_SubString_M1 {
    public static void main(String[] args) {

        String str = "JavaExamplesJavaCodeJavaProgram";

        String strFind = "Java";
        int count = 0, fromIndex = 0;
        //until index positions are found in str loop continously over string and when  indexOf does not find
        //next index it returns -1 and while loop exits. until then when loop executes continously.
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){

            System.out.println("Found at index: " + fromIndex);
            count++;
            //fromIndex is incremented by 1 every time when position is found to avoid infinite loop
            fromIndex++;

        }

        System.out.println("Total occurrences: " + count);
    }
}
