package collections_problems.copy_or_clone_map_p75;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Copy_Or_Clone_HashMap_M2 {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1l, "Alex", LocalDate.of(1990, 01, 01)));
        employeeMap.put(2, new Employee(2l, "Bob", LocalDate.of(1990, 02, 01)));

// Shallow clone
        Map<Integer, Employee> clonedMap = employeeMap.entrySet()
                .stream()
                //perform customization
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

// Same as employeeMap
        System.out.println(clonedMap);
    }
}

//console
/*
{1=Employee [id=1, name=Alex, dob=1990-01-01], 2=Employee [id=2, name=Bob, dob=1990-02-01]}
 */