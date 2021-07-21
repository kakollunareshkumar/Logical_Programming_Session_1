package string_contains_substring_or_not_p16;

public class String_Contains_SubString_Or_Not_M2 {
    public static void main(String[] args) {

        String s1 = "is";
        String s2 = "harish";

        int res = isSubstring(s1, s2);

        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);
    }

    static int isSubstring(String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;

            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++) {
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
            }

            if (j == M)
                return i;
        }

        return -1;
    }

}
