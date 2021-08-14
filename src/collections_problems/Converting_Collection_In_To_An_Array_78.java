package collections_problems;

import java.util.Arrays;
import java.util.List;

public class Converting_Collection_In_To_An_Array_78 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ana", "mario", "vio");
        Object[] namesArrayAsObjects = names.toArray();
        System.out.println(Arrays.toString(namesArrayAsObjects));
    }
}
