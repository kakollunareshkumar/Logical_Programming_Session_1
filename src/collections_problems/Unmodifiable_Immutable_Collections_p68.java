package collections_problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unmodifiable_Immutable_Collections_p68 {

    private static final List<Integer> LIST
            = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));

    private static final List<Integer> LIST1 = List.of(1, 2, 3, 4, 5);




    public static void main(String[] args) {


        /*
ImmutableList.of() can also be used to return an immutable empty list.
This list behaves and performs comparably to Collections.emptyList(), and is preferable mainly for consistency
and maintainability of code. The list is internally cast to any type as it will never hold any elements.
         */

       // List<String> immutableList = ImmutableList.of();



    }

}
