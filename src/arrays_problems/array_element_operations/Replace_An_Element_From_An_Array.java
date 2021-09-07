package arrays_problems.array_element_operations;

import java.util.Arrays;
import java.util.Scanner;

public class Replace_An_Element_From_An_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n = sc.nextInt();    //Array Size Initialization
        int count = 0;
        Integer arr[] = new Integer[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++)     //Array Initialization
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position you want to replace an element");
        int pos = sc.nextInt();

        System.out.println("Enter the element you want to insert :");
        int ele = sc.nextInt();
        for (int i = 0; i < n; i++)     //Array Initialization
        {
            if(i==pos)
            {
                arr[i] = ele;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
