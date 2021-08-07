package objects_features.null_reference_check_p40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dummy {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
        List<Integer> evenList = evenIntegers(numbers);
        System.out.println(evenList);
    }
    public static List<Integer> evenIntegers(List<Integer> integers) {

        if (integers == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();
        for (Integer nr: integers) {
            if (nr != null && nr % 2 == 0) {
                evens.add(nr);
            }
        }

        return evens;
    }
}
