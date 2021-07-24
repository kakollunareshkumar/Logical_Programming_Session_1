package longest_common_prefix_p22;

public class Longest_Common_Prefix_In_String_Array_M2 {
    public static void main(String[] args)
    {
        String[] strArr={"Apple","App","Apricot"};
        String longestPrefix=getLongestCommonPrefix(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);
    }
    public static String getLongestCommonPrefix(String[] strArr) {
        if(strArr.length==0) return "";
        // Find minimum length String
        String minStr=getMinString(strArr);

        int minPrefixStrLength=minStr.length();
        for(int i=0;i<strArr.length;i++){
            int j;
            for( j=0;j<minPrefixStrLength;j++){
                if(minStr.charAt(j)!=strArr[i].charAt(j))  //if character at min word does not equlal to array of word 1
                    break;                                 //then exit from inner loop
            }
            if(j<minPrefixStrLength)    // javah ja  jav
                minPrefixStrLength=j;
        }
        return minStr.substring(0,minPrefixStrLength);
    }
    //get minimum  element from string array
    public static String getMinString(String[] strArr)
    {
        String minStr=strArr[0];
        for(int i=1;i<strArr.length;i++){
            if(strArr[i].length()<minStr.length())
                minStr=strArr[i];
        }
        return minStr;
    }
}
