package remove_leading_and_trailing_spaces_from_string_p21;

public class Remove_Leading_Trailing_Spaces_From_String_M3 {
    public static void main(String[] args) {
        //^ - means start of the string
        //\\s - matches space characters
        //+ - one or more
        // $ -end of the string

        //Using Regex to remove white spaces
        String str = "  string with white spaces  ";
        str = str.replaceAll("^\\s+|\\s+$", "");
        System.out.println("\"" + str + "\"");

        //Java compiler indeed treats spaces, tabs and all other whitespace characters equally.
        System.out.println( str.replaceAll("^[ \t]+|[ \t]+$", "") );
        //removes leading spaces
        System.out.println( str.replaceAll("^[ \t]+", "") );
        //removes trailing spaces
        System.out.println( str.replaceAll("[ \t]+$", "") );
    }
}


