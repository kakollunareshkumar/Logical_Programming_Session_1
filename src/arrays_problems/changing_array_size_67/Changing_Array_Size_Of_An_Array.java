package arrays_problems.changing_array_size_67;

import java.util.Arrays;

public class Changing_Array_Size_Of_An_Array {
    public static void main(String[] args) {
        int[] arr = {3,6,9,-1};
        int [] arr1 = add(arr,20);

        //With out built in function
        int[] arr2 = new int[arr.length+1];

        for(int i=0;i<arr.length;i++)
        {
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = 20;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    //With built in function
    public static int[] add(int[] arr, int element) {

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = element;

        return newArr;
    }
}
