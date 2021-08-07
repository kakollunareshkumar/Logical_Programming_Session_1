package objects_features.null_reference_check_p40;

import java.util.*;
//New Approach
public class Checking_Null_References_And_Throwing_Customized_NullPointerException_New_Approach {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
        List<Integer> evenList = evenIntegers(numbers);
        System.out.println(evenList);
    }
//Starting with JDK 8, the java.util.Objects class contains two methods that wrap the null checks based on
// these two operators: object == null was wrapped in Objects.isNull(),
// and object != null was wrapped in Objects.nonNull()

    public static List<Integer> evenIntegers(List<Integer> integers) {

        if (Objects.isNull(integers)) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();

        for (Integer nr: integers) {
            if (Objects.nonNull(nr) && nr % 2 == 0) {
                evens.add(nr);
            }
        }

        return evens;
    }
}


