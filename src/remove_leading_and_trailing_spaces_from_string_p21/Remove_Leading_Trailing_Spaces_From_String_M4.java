package remove_leading_and_trailing_spaces_from_string_p21;

public class Remove_Leading_Trailing_Spaces_From_String_M4 {
    public static String ltrim(String str)
    {
        int i = 0;
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {    // Hello World
            i++;
        }
        return str.substring(i);
    }

    public static String rtrim(String str)
    {
        int i = str.length() - 1;
        while (i >= 0 && Character.isWhitespace(str.charAt(i))) {
            i--;
        }
        return str.substring(0, i + 1);
    }

    public static void main(String[] args)
    {
        String str = "  Hello World  ";

        System.out.println("Left Trim :" + ltrim(str) +":");
        System.out.println("Right Trim :" + rtrim(str) +":");
    }
}


