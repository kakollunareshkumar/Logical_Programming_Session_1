package string_contains_substring_or_not_p16;

public class String_Contains_SubString_Or_Not_M1 {
    public static void main(String[] args) {

        // 1st example - You can use the indexOf() method to check if
        // a String contains another substring in Java
        // if it does then indexOf() will return the starting index of
        // that substring, otherwise it will return -1

        System.out .println("Checking if one String contains another S tring using indexOf() in Java");
        String input = "Java is the best programming language";
        boolean isPresent = input.indexOf("Java") != -1 ? true : false;
        if (isPresent) { System.out.println("input string: " + input);
            System.out.println("search string: " + "Java");
            System.out.println("does String contains substring? " + "YES");
        }

// indexOf is case-sensitive so if you pass wrong case, you will get wrong
// result System.out.println("Doing search with different case");
// false because indexOf() is // case-sensitive
        isPresent = input.indexOf("java") != -1 ? true : false;
        System.out.println("isPresent: " + isPresent);


// 2nd example - You can also use the contains() method to check if
// a String contains another String in Java or not. This method
// returns a boolean, true if substring is found on String, or false
// otherwise. if you need boolean use this method rather than indexOf()
        System.out .println("Checking if one String contains another String using contains() in Java");
        input = "C++ is predecessor of Java";
        boolean isFound = input.contains("Java");
        if (isFound) { System.out.println("input string: " + input);
            System.out.println("search string: " + "Java");
            System.out.println("does substring is found inside String? " + "YES"); }

        // contains is also case-sensitive
        System.out.println("Searching with different case");
        isFound = input.contains("java");
        System.out.println("isFound: " + isFound); // false because indexOf() is // case-sensitive
    }

}
