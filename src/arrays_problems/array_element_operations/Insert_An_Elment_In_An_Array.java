package arrays_problems.array_element_operations;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_An_Elment_In_An_Array {
    public static int[] addElement(int n, int arr[], int ele, int pos)
    {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from the old array into the new array

        for (i = 0; i < n + 1; i++)
        {
            if (i < pos - 1)
                newarr[i] = arr[i];  // insert all elements till position
            else if (i == pos - 1)
                newarr[i] = ele;        // then insert element at specific position
            else
                newarr[i] = arr[i - 1]; // then insert rest of the elements
        }
        return newarr;
    }


    //Main Method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization

        int arr[]=new int[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to insert :");
        int ele = sc.nextInt();

        // Position to insert
        System.out.println("Enter the position where you want to insert :");
        int pos = sc.nextInt();

        arr = addElement(n, arr, ele, pos);

        // print the updated array
        System.out.println("\nArray with " + ele  + " inserted at position " + pos + ":\n" + Arrays.toString(arr));

    }
}
