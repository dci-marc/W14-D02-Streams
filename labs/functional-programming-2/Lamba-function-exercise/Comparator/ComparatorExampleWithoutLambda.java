package Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorExampleWithoutLambda {
    /**
     * - Create Employee Class and declare properties ,getters and setters
     * - Create a main class and add few employee records
     * - Add those employees in list
     * - Use comparator sort method to sort the records
     * - Print the records
     */
    public static void main(String[] args) {
        System.out.println("+++ Exercise 1.5.1");

       //create a few dummy employee records and put them in a simple ArrayList instance.
        Employee employee1 = new Employee(2, "A", "F", 18);
        Employee employee2 = new Employee(3, "z", "P", 20);
        Employee employee3 = new Employee(5, "c", "G", 17);
        Employee employee4 = new Employee(1, "d", "F", 21);
        Employee employee5 = new Employee(4, "w", "W", 22);

        //add employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        //use sorting method without using lambda
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        //display the sorted list
        for(Employee e: employees) {
            System.out.println(e);
        }
    }
}





