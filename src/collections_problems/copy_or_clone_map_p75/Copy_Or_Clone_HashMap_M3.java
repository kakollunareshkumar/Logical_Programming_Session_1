package collections_problems.copy_or_clone_map_p75;

import java.time.LocalDate;
import java.util.HashMap;

public class Copy_Or_Clone_HashMap_M3 {
    public static void main(String[] args) {
        /*
        2. How to deep clone HashMap
The most effective way to deep clone a Java object is serialization. The same applies to deep clone a HashMap as well. Here,
we are using Google Gson library to serialize the HashMap and deserialize to create HashMap deep copy.

         */


        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1l, "Alex", LocalDate.of(1990, 01, 01)));
        employeeMap.put(2, new Employee(2l, "Bob", LocalDate.of(1990, 02, 01)));

//Deep clone
//        Gson gson = new Gson();
//        String jsonString = gson.toJson(employeeMap);
//
//        Type type = new TypeToken<HashMap<Integer, Employee>>(){}.getType();
//        HashMap<Integer, Employee> clonedMap = gson.fromJson(jsonString, type);
//
//        System.out.println(clonedMap);
//
////--------------------------------------
//
//        System.out.println("\nChanges DO NOT reflect in other map \n");
//
////Change a value is clonedMap
//        clonedMap.get(1).setName("Charles");
//
////Verify content of both maps
//        System.out.println(employeeMap);
//        System.out.println(clonedMap);
    }
}

//console
/*
{1=Employee [id=1, name=Alex, dob=1990-01-01], 2=Employee [id=2, name=Bob, dob=1990-02-01]}

Changes DO NOT reflect in other map

{1=Employee [id=1, name=Alex, dob=1990-01-01], 2=Employee [id=2, name=Bob, dob=1990-02-01]}
{1=Employee [id=1, name=Charles, dob=1990-01-01], 2=Employee [id=2, name=Bob, dob=1990-02-01]}
 */