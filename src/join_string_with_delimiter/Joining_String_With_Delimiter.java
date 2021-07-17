package join_string_with_delimiter;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Joining_String_With_Delimiter {
    public static void main(String[] args) {
        //Method M1
        String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
        System.out.println(joinedString);

        //Method  M2      source howtodoinjava.com
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("How")
                .add("To")
                .add("Do")
                .add("In")
                .add("Java");
        System.out.println(joiner);
        //Method M3
        List<String> stringList = Arrays.asList("How", "To", "Do", "In", "Java");

        String finalString =   stringList
                .stream()
                .collect(Collectors.joining(", ","[","]"));

        System.out.println(finalString);

    }
}
