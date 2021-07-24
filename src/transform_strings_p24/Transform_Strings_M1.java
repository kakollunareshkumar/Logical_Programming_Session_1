package transform_strings_p24;

import java.util.stream.Stream;

public class Transform_Strings_M1 {
    public static void main(String[] args) {

        // hello world
        //Add list of objects by using Stream.of method
        String resultMap = Stream.of("hello")
                .map(s -> s + " world")         //append hello to world
                .findFirst()                    //findFirst will return Optional object. If we want string object
                                                // back we need to use get method that is present in optional class
                .get();                         //get string object back
        System.out.println("Result map  "+resultMap);


        String resultMap1 = Stream.of("")
                .map(String::toUpperCase)       //convert empty string to upper case
                .map(s -> s.repeat(2))          //repeat empty string twice
                .map(s -> s.replaceAll("O", "OOOO"))    //replace single 0's with 4 o's
                .findFirst()
                .get();                             //get string object back


        System.out.println("Result map1  "+resultMap1);

    }
}
