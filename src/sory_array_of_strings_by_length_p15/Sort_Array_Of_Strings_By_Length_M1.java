package sory_array_of_strings_by_length_p15;

//Sorting with out using inbuilt function
public class Sort_Array_Of_Strings_By_Length_M1 {
    public static void main(String[] args) {
        String []arr = {"Apple", "banana", "kiwi"};
        int n = arr.length;

        // call sorting function to sort string elements by length
        sort(arr,n);
        // print sorted String array
        printArraystring(arr, n);

    }
//this sorting is performed using insertion sort technique
    static void sort(String []s, int n)
    {
        //initialized i with 1th index to compare previous element 0th position
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];

            // j element to swap positions of Strings words if length of temp String is less than the jth position String
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }

    static void printArraystring(String str[], int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(str[i]+" ");
    }

}
