package concatinate_string_n_times_p20;

public class Concatinate_String_N_Times_M2 {
    // Function which return string by concatenating it.
    static String repeat(String s, int n)
    {
        // Copying given string to temparory string.
        String s1 = s;

        for (int i = 1; i < n; i++)
            s = s + s1;   // Concatenating strings

        return s;
    }

    // Main method
    public static void main(String[] args)
    {
        String s = "hello";
        int n = 3;
        System.out.println(repeat(s, n));
    }
}
