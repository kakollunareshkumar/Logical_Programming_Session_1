package arrays_problems.reverse_an_array_p64;


import java.util.Arrays;
//using built in function
public class Reverse_An_Array_M4 {
    public static void main (String[] args) {
        String[] arr = {"Hello","World"};
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length; i > 0; i--) {
            reversed.append(arr[i - 1]).append(" ");
        };

        String[] reversedArray = reversed.toString().split(" ");

        System.out.println(Arrays.toString(reversedArray));
    }
}
