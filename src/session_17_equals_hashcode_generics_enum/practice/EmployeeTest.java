package session_17_equals_hashcode_generics_enum.practice;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setId(1L);
        employee1.setFirstName("John");
        employee1.setLastName("Brown");

        Employee employee2 = new Employee();

        employee2.setId(1L);
        employee2.setFirstName("John");
        employee2.setLastName("Brown");

//        Employee employee2 = new Employee();
//
//        employee2.setId(2L);
//        employee2.setFirstName("Bob");
//        employee2.setLastName("James");

        System.out.println("employee 1 equals employee2: " + employee1.equals(employee2));

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);

        System.out.println(employeeSet.size());
        System.out.println(employee1);
    }
}