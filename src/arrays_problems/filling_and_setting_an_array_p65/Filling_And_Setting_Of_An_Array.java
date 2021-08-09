package arrays_problems.filling_and_setting_an_array_p65;

import java.util.Arrays;

public class Filling_And_Setting_Of_An_Array {
    public static void main(String[] args) {
        //With out using built in
        int[] arr = new int[10];                        // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

        //Using built in
//        Arrays.fill(arr, 1);
//        System.out.println(Arrays.toString(arr));

        //With out using generator function
        //Suppose we want to increment each element present in array by 1  we can do below way
//        for (int i = 0; i < arr.length; i++) {         // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
//            arr[i] = arr[i] + 1;
//        }
//        System.out.println(Arrays.toString(arr));

//        //With using generator function
//        /*For such tasks, JDK 8 comes with a bunch of Arrays.setAll() and Arrays.parallelSetAll() methods.
//        For example, the preceding snippet of code can be rewritten
//        via setAll(int[] array, IntUnaryOperator generator) as follows: */

        Arrays.setAll(arr, t -> {                       // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
            //t is an array or element  ?
            if (t == 0) {
                return arr[t];
            } else {
                return arr[t] + 1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
