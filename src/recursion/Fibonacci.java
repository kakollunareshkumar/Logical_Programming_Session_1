package recursion;

public class Fibonacci {
    //Fibonacci Series using Recursion
  //  A Fibonacci Series in Java is a series of numbers in which the next number is the sum of the previous two numbers.
    //  The first two numbers of the Fibonacci series are 0 and 1/
    //0 1 1 2 3 5 8 13 21 34 ...

        static int fib(int n)
        {
            if (n <= 1)
                return n;
            return fib(n-1) + fib(n-2);
        }

        public static void main (String args[])
        {
            int n = 9;
            System.out.println(fib(n));
        }
}
