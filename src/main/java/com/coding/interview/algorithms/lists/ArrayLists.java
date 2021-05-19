package com.coding.interview.algorithms.lists;

import com.coding.interview.algorithms.common.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        Employee testEmployee = new Employee("John", "Doe", 4567);
        employeeList.add(testEmployee);
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 351));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        employeeList.add(3, testEmployee);

        employeeList.forEach(System.out::println);

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee em : employeeArray) {
            System.out.println(em);
        }

        System.out.println(employeeList.contains(testEmployee));

        System.out.println(employeeList.contains(new Employee("Mike", "Wilson", 3245)));

        employeeList.remove(2);

        employeeList.forEach(System.out::println);
    }
}
