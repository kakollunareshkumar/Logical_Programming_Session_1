package collections_problems;
import java.util.*;
public class Dummy {

    public static void main(String[] args)
    {

        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        System.out.println(i);
        List<Integer> i1 = Collections.unmodifiableList(i);
        System.out.println(i1);
        i.add(4);
        System.out.println(i);
        System.out.println(i1);

        i1.add(5);   //UnsuportedOperationException

    }
}

