package remove_character_from_string_p13;

public class Remove_All_Occurance_Of_A_Character_From_String_M1 {
    public static void main(String[] args) {

        String s = "agbg";
        removeChar(s, 'g');
    }
    static void removeChar(String s, char c)
    {
        int j, count = 0, n = s.length();
        char []t = s.toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            //if index position of character and passed characters are equal then increment i and j iteration values.
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;    //if matched character is found increment counter by 1.
        }
        //loop untill count value of passed character is replaced with null character.
        while(count > 0)
        {
            t[j++] = '\0';        //insert null character at index position where character is found.
            count--;
        }

        System.out.println(t);
    }
}
