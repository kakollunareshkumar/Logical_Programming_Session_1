package remove_leading_and_trailing_spaces_from_string_p21;

public class Remove_Leading_Trailing_Spaces_From_String_M2 {
    public static void main(String[] args) {
        String str = new String(" Hello Naresh ");
        System.out.println("String: "+str);
        System.out.println("Result after removing leading and trailing spaces:" );
        //strip() method introduced in java11
        //By using strip replaces leading and trailing spaces
        System.out.println("After strip: \"" + str.strip()+"\"");
        //stripLeading() only removes leading spaces from start  of string
        System.out.println("After  Removing Leading spaces strip: \"" + str.stripLeading()+"\"");
        //stripTrailing() only removes Trailing spaces from end  of string
        System.out.println("After  Removing Trailing spaces: \"" + str.stripTrailing()+"\"");

    }
}


