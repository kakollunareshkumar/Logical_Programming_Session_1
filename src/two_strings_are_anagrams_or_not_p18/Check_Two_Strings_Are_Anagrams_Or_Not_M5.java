package two_strings_are_anagrams_or_not_p18;

public class Check_Two_Strings_Are_Anagrams_Or_Not_M5 {
    public static void main(String[] args) {
        if(checkAnagram("stop", "pots"))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");

    }

    //Function checks anagram using the substring() method
    public static boolean checkAnagram(String a,String b){
        //if lengths are  not identical then strings are not Anagram
        if(a.length() != b.length())
            return false;

        /*
         *pick characters from string-I one by one
         *and remove the same from String-II
         */
        int index;
        for(int i=0; i<a.length(); i++){
            //if a character of string-I doesn't even exists in string-II
            //then the strings are not anagrams
            if((index = b.indexOf(a.charAt(i))) != -1){
                //removing character using the substring() method
                b= b.substring(0, index) + b.substring(index+1, b.length());
                System.out.println("Resultant String b  "+b);
            } else{
                return false;
            }
        }

        //If length of string-II reduces to 0, then strings are Anagram
        if(b.length() == 0)
            return true;
        else
            return false;

    }
}
