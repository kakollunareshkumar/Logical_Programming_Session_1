package arrays_problems.find_element_in_an_array_p59;

import java.util.Arrays;

public class Find_Element_In_An_Array_M3 {

    public static void main(String[] args) {

        int[] arr = {3,6,-1,50,25,16};
        if(containsElement(arr, 16))
        {
            System.out.println("Array contains element ");
        }
        else
        {
            System.out.println("Array does not contains element ");
        }

    }

    public static boolean containsElement(int[] arr, int element) {
        //converting array to stream of elements and checking passed element is present in the stream of elements
        //or not.
        return Arrays.stream(arr)
                .anyMatch(e -> e == element);
    }
}
