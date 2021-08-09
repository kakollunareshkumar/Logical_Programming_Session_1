package arrays_problems.find_element_in_an_array_p59;

import java.util.Arrays;
//Using built in function
public class Find_Element_In_An_Array_M2 {

    public static void main(String[] args) {

        int[] arr = {3,6,-1,50,25,16};
        if(containsElement(arr, 16))
        {
            System.out.println("Array contains element ");
        }
        else
        {
            System.out.println("Array does not contains element");
        }

    }

    public static boolean containsElement(int[] arr, int element) {
        //For binary search to perform array should be sorted first
       /*
        Params:
        a – the array to be searched
        key – the value to be searched for
        Returns:
        index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
        The insertion point is defined as the point at which the key would be inserted into the array: the index of the first element greater than the key,
        or a.length if all elements in the array are less than the specified key.
        Note that this guarantees that the return value will be >= 0 if and only if the key is found.
             */
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, element);
        return (index >= 0);
    }
}
