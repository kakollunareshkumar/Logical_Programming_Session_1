package reversing_letters_words_p3;

import java.util.Scanner;

public class Reverse_words_letters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input String");
        String str = sc.nextLine();
        System.out.println(reverseLettersAndWords(str));
    }
    public  static  String reverseLettersAndWords(String str)
    {
        String WHITESPACE = " ";

        String [] words = str.split(WHITESPACE);

        StringBuilder reversedString = new StringBuilder();
           //First loop is reverse of   letters in a a word
        for(String word:words)
        {
            StringBuilder reversedWord = new StringBuilder();
            for(int i=word.length()-1; i>=0;i--){
              //  reversedWord.append(word[i]).append(WHITESPACE);
                reversedWord.append(word.charAt(i));
            }
            reversedString.append(reversedWord).append(WHITESPACE);

        }

        String[] rwords = reversedString.toString().split(WHITESPACE);
        StringBuilder reversedWord = new StringBuilder();
        //Second loop is for reversing of words
        for(int j=rwords.length-1;j>=0;j--){

            reversedWord.append(rwords[j]).append(WHITESPACE);

        }
        return  reversedWord.toString();
    }
}
