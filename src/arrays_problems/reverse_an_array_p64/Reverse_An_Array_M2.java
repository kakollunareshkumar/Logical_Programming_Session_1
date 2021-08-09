package arrays_problems.reverse_an_array_p64;

import java.util.Arrays;
import java.util.Collections;

//Using bult in function
public class Reverse_An_Array_M2 {
    /*function reverses the elements of the array*/
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args)
    {
        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
}
