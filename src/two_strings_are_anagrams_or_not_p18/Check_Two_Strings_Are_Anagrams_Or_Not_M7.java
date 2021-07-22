package two_strings_are_anagrams_or_not_p18;

public class Check_Two_Strings_Are_Anagrams_Or_Not_M7 {
    public static void main(String[] args) {
        if(checkAnagram("cat", "bat"))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");

    }

    //Function check anagram using StringBuffer
    public static boolean checkAnagram(String a, String b){

        //if lengths are not identical then strings are not Anagram
        if(a.length() != b.length())
            return false;

        StringBuffer sb = new StringBuffer(b);

        /*
         *pick characters from string-I one by one
         *and remove the same from String-II
         */
        for(int i=0; i<a.length(); i++){

            if(sb.indexOf(a.charAt(i)+"")!=-1)
            {
                sb.deleteCharAt(sb.indexOf(a.charAt(i)+""));
            }
            else
            {
                return  false;
            }
        }

        //If length of string-II reduces to 0, then strings are Anagram
        if(sb.length() == 0)
            return true;
        else
            return false;
    }
}
