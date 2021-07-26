package Max_And_Minimum_Of_Two_Numbers_25;

import java.util.Scanner;

public class Max_And_Min_Of_Two_Numbers {
    public static void main(String args[]) throws InterruptedException {
        Scanner scnr = new Scanner(System.in); // Calculating Maximum two numbers in Java
        System.out.println("Please enter two numbers to find maximum of two");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        if (a > b)
        { System.out.printf("Between %d and %d, maximum is %d %n", a, b, a);
        }
        else
        {
            System.out.printf("Between %d and %d, maximum number is %d %n", a, b, b);
        }
        int max = Math.max(a, b);
        System.out.printf("Maximum value of %d and %d using Math.max() is %d %n", a, b, max);
        // Calculating Minimum between two numbers in Java
        System.out.println("Please enter two numbers to find minimum of two");
        int x = scnr.nextInt();
        int y = scnr.nextInt();
        if (x < y) {
            System.out.printf("Between %d and %d, Minimum Number is %d %n", x, y, x);
        }
        else {
            System.out.printf("Between %d and %d, Minimum is %d %n", x, y, y);
        }
        int min = Math.min(x, y);
        System.out.printf("Maximum value of %d and %d using Math.min() is %d %n", x, y, min); }
    }

        /* output
        Between 10 and 15, maximum number is 15
        Maximum value of 10 and 15 using Math.max() is 15
        Please enter two numbers to find minimum of two
        -1
        3
        Between -1 and 3, Minimum Number is -1
        Maximum value of -1 and 3 using Math.min() is -1  */