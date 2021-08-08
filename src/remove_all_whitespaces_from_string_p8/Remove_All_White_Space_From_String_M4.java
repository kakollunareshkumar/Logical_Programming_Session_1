package remove_all_whitespaces_from_string_p8;

public class Remove_All_White_Space_From_String_M4
{
    static int removeSpaces(char [] ch)
    {
        // To calculate  non-space character count
        int count = 0;

        for (int i = 0; i<ch.length; i++)

            //if character is not a space then increment the count by 1 and insert character at specified char array
            //index position
            if (ch[i] != ' ')
                ch[count++] = ch[i];

        return count;

        //increment and decrement
        //++5  and   5++
        //pre increment
        //a=++1;    a=2            ++=> +1
        //b=2
        //c=b+a =>4

        // post increment
        //a=1++;
        //b=2
        //c=b+a =>3     a=2

    }
    //Main method
    public static void main(String[] args)
    {
        char ch[] = "my name is suresh".toCharArray();
        int i = removeSpaces(ch);
        System.out.println(String.valueOf(ch).substring(0,i));
    }
}


