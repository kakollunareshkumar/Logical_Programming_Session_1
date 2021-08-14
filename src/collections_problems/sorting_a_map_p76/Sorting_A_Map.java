package collections_problems.sorting_a_map_p76;

import java.util.*;

public class Sorting_A_Map {
    /*
Ways to sort  a map
TreeMap
ArrayList and Collections.sort()
TreeSet
Using the Stream API, and finally,
     */
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();

        Employee employee1 = new Employee(1L, "Mher");
        map.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map.put(employee3.getName(), employee3);
        Employee employee4 = new Employee(2L, "George");
        map.put(employee4.getName(), employee4);

        TreeMap<String, Employee> sorted = new TreeMap<String,Employee>(map);
        System.out.println(sorted);
        /*
        2. Using ArrayList
        //3.1. Sort by Key
         */
        List<String> employeeByKey = new ArrayList<>(map.keySet());
        Collections.sort(employeeByKey);
        System.out.println("sorting by keys"+sorted);
        //3.2. Sort by Value
        List<Employee> employeeById = new ArrayList<>(map.values());
        Collections.sort(employeeById);
        System.out.println("sorting by values "+sorted);


       // 4. Using a TreeSet
        SortedSet<String> keySet = new TreeSet<>(map.keySet());
        SortedSet<Employee> values = new TreeSet<>(map.values());



    }

}
