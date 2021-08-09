package arrays_problems.compare_arrays_lexicographically_p61;

import java.util.Arrays;

public class Compare_Arrays_lexicographically_M1 {

    public static void main(String[] args) {

        int[] i1 = {2, 4, 6, 8, 10};
        int[] i2 = {2, 4, 6, 8, 10};
        int[] i3 = {2, 4, 12, 8, 10};

        System.out.println("i1: "+ Arrays.toString(i1));
        System.out.println("i2: "+ Arrays.toString(i2));
        System.out.println("i3: "+ Arrays.toString(i3));

        /*
        A null array is lexicographically less than a non-null array.
        Two arrays are considered equal if both are null.
        If first array and second array are equal then compare() returns zero;
        If the first array (or slice) is lexicographically less than the second array (or slice) returns -ve (negative value).
        If the first array (or slice) is lexicographically greater than the second array (or slice) returns +ve (positive value).
         */


        // Comparing arrays lexicographically
        System.out.println("\nArrays.compare(i1, i2): " + Arrays.compare(i1, i2));
        System.out.println("Arrays.compare(i1, i3): " + Arrays.compare(i1, i3));
        System.out.println("Arrays.compare(i3, i1): " + Arrays.compare(i3, i1));

        // Comparing slices of arrays lexicographically
        System.out.println("\nArrays.compare(i1, 0, 3, i3, 0, 3): " +
                Arrays.compare(i1, 0, 3, i3, 0, 3));
        System.out.println("Arrays.compare(i1, 0, 3, i2, 0, 3): " +
                Arrays.compare(i1, 0, 3, i2, 0, 3));
        System.out.println("Arrays.compare(i3, 0, 3, i1, 0, 3): " +
                Arrays.compare(i3, 0, 3, i1, 0, 3));
    }
}
