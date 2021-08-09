package arrays_problems.two_arrays_equals_or_not_p60;

import java.util.Arrays;

public class Two_Arrays_Equals_or_Not_M1 {

    public static boolean areEqual(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;

        // If lengths of both arrays are not equal means arrays are not equal
        if (n != m)
            return false;

        //Using Built in function
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean b = Arrays.equals(arr1,arr2);
        if(b)
        {
            System.out.println("Both arrays elements are equal");
        }
        else
        {
            System.out.println("Both arrays elements are not equal");
        }

        //With out built in function
        // Linearly compare elements
        for (int i = 0; i < n; i++)
            if (arr1[i] != arr2[i])
                return false;

        // If all elements were same.
        return true;
    }

    // Main method
    public static void main(String[] args)
    {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };

        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
