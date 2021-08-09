package arrays_problems.array_mismatch;

import java.util.Arrays;

public class Arrays_Mismatch_M1 {
    public static void main(String[] args) {

        int[] i1 = {2, 4, 6, 8, 10};
        int[] i2 = {2, 4, 6, 8, 10};
        int[] i3 = {2, 12, 6, 8, 10};

        System.out.println("i1: "+ Arrays.toString(i1));
        System.out.println("i2: "+ Arrays.toString(i2));
        System.out.println("i3: "+ Arrays.toString(i3));

        /*
        Params:
        a – the first array to be tested for a mismatch
        b – the second array to be tested for a mismatch
        Returns:
        the index of the first mismatch between the two arrays, otherwise -1.
        Throws:
        NullPointerException – if either array is null
         */

        // Finding first mismatch
        System.out.println("\nArrays.mismatch(i1, i2): " + Arrays.mismatch(i1, i2));
        System.out.println("Arrays.mismatch(i1, i3): " + Arrays.mismatch(i1, i3));
        System.out.println("Arrays.mismatch(i3, i1): " + Arrays.mismatch(i3, i1));

        // Finding first mismatch in slices
        System.out.println("\nArrays.mismatch(i1, 0, 3, i3, 0, 3): " +
                Arrays.mismatch(i1, 0, 3, i3, 0, 3));
        System.out.println("Arrays.mismatch(i1, 0, 3, i2, 0, 3): " +
                Arrays.mismatch(i1, 0, 3, i2, 0, 3));
        System.out.println("Arrays.mismatch(i3, 0, 3, i1, 0, 3): " +
                Arrays.mismatch(i3, 0, 3, i1, 0, 3));
    }
}
