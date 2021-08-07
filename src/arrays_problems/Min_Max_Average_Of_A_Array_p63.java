package arrays_problems;

public class Min_Max_Average_Of_A_Array_p63 {
    public static void main(String[] args) {
        int sum= 0;
        int max = 0;
        int min = 0;

        int[] values = {90, -1, 2, 75, 30, 40,10,28,58,25,83};


        for (int i=0;i< values.length;i++)
        {
            sum = sum+values[i];

            if(min>values[i])
            {
                min=values[i];
            }
            if(max<values[i])
            {
                max=values[i];
            }
        }
        double average = (double) sum/values.length;
        System.out.println("Minimum value of an array "+min);
        System.out.println("Maximum value of an array "+max);
        System.out.println("Average value of an array "+average);

    }
}
