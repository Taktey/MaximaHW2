package Collections_Map_18_03_24.Sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("Ben", 40),
                new Employee("Helen", 100),
                new Employee("Tomas", 20),
                new Employee("Alex", 60)));
        Collections.sort(employees);
        System.out.println(employees);
        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println(employees);

        Set<Employee> set = new TreeSet<>();
        set.add(new Employee("Ben", 40));
        set.add(new Employee("Helen", 100));
        set.add(new Employee("Tomas", 20));
        set.add(new Employee("Alex", 60));

        System.out.println("set:" + set);

        Set<Employee> setWithComp = new TreeSet<>(new EmployeeSalaryComparator());
        setWithComp.add(new Employee("Ben", 40));
        setWithComp.add(new Employee("Helen", 100));
        setWithComp.add(new Employee("Tomas", 20));
        setWithComp.add(new Employee("Alex", 60));
        System.out.println("set with comparator: " + setWithComp);
    }
}
