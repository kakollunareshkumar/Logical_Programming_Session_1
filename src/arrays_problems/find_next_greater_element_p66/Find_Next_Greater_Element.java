package arrays_problems.find_next_greater_element_p66;

public class Find_Next_Greater_Element {
    public static void main(String[] args) {

        int[] integers = {1, 2, 3, 4, 12, 2, 1, 4};
        println(integers);
        //We need to fetch an right side element greater than current element in array.
        // If greater element is present place that element right side of current element
        //or print -1 on right side of element if greater element is not present on right
        //hand side

        //1 : 2   2 : 3   3 : 4   4 : 12   12 : -1   2 : 4   1 : 4   4 : -1

    }

    public static void println(int[] arr) {

        int nge;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            nge = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    nge = arr[j];
                    break;
                }
            }

            System.out.println(arr[i] + " : " + nge);
        }
    }
}
