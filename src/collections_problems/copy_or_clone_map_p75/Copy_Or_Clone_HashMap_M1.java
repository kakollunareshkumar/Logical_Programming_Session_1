package collections_problems.copy_or_clone_map_p75;

import java.time.LocalDate;
import java.util.HashMap;

public class Copy_Or_Clone_HashMap_M1 {
    public static void main(String[] args) {
        /*
1. Clone HashMap – shallow copy
1.1. HashMap clone() method
The best way to create shallow clone of hashmap is to use it’s clone() method. It returns a shallow copy of the map.
The keys and values themselves are not cloned; and point to same object in memory as in original map.
         */
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1l, "Alex", LocalDate.of(1990, 01, 01)));
        employeeMap.put(2, new Employee(2l, "Bob", LocalDate.of(1990, 02, 01)));

        //Shallow clone
        HashMap<Integer, Employee> clonedMap = (HashMap<Integer, Employee>) employeeMap.clone();

        //Same as employeeMap
        System.out.println(clonedMap);

        System.out.println("\nChanges reflect in both maps \n");

        //Change a value is clonedMap
        clonedMap.get(1).setName("Charles");

        //Verify content of both maps
        System.out.println(employeeMap);
        System.out.println(clonedMap);

    }
}

//console
/*
{1=Employee [id=1, name=Alex, dob=1990-01-01], 2=Employee [id=2, name=Bob, dob=1990-02-01]}

Changes reflect in both maps

{1=Employee [id=1, name=Charles, dob=1990-01-01], 2=Employee [id=2, name=Bob, dob=1990-02-01]}
{1=Employee [id=1, name=Charles, dob=1990-01-01], 2=Employee [id=2, name=Bob, dob=1990-02-01]}
 */