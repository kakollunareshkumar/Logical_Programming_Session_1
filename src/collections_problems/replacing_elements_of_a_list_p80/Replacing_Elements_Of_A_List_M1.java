package collections_problems.replacing_elements_of_a_list_p80;
import java.util.*;

public class Replacing_Elements_Of_A_List_M1 {
    public static void main(String[] args) {
        /*  To replace an element in Java ArrayList, set() method of java.util. An ArrayList class can be used.
        The set() method takes two parameters-the indexes of the element which has to be replaced and the new element.
        The index of an ArrayList is zero-based. So, to replace the first element, 0 should be the index passed as a parameter.
        Declaration:
        public Object set(int index, Object element)
        Return Value: The element which is at the specified index
        Exception Throws: IndexOutOfBoundsException
        This occurs when the index is out of range.
        index < 0 or index >= size()  */

        // Try block to check for exceptions
        try {
            // Creating an object of Arraylist class
            ArrayList<String> list = new ArrayList<>();
            // Adding elements to the List
            // using add() method
            // Custom input elements
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            // Print all the elements added in the above object
            System.out.println(list);
            // 2 is the index of the element "C".
            //"C" will be replaced by "E"
            list.set(2, "E");
            // Printing the newly updated List
            System.out.println(list);
        }
        // Catch block to handle the exceptions
        catch (Exception e) {
            // Display the exception on the console
            System.out.println(e);
        }
    }
}

