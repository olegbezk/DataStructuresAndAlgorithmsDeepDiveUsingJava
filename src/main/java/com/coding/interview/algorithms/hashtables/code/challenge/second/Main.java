package com.coding.interview.algorithms.hashtables.code.challenge.second;

import com.coding.interview.algorithms.common.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(System.out::println);

        returnUniqueEmployees(employees)
                .forEach(value -> System.out.println("Unique employee: " + value));

        removeDuplicates(employees).forEach(System.out::println);
    }

    public static LinkedList<Employee> returnUniqueEmployees(LinkedList<Employee> employees) {
        Map<Integer, Employee> uniqueEmployees = new HashMap<>();

        for (Employee employee : employees) {
            if (!uniqueEmployees.containsKey(employee.getId())) {
                uniqueEmployees.put(employee.getId(), employee);
            }
        }
        return new LinkedList<>(uniqueEmployees.values());
    }

    public static LinkedList<Employee> removeDuplicates(LinkedList<Employee> employees) {
        Map<Integer, Employee> employeeTable = new HashMap<>();
        List<Employee> duplicates = new ArrayList<>();

        for (Employee employee : employees) {
            if (employeeTable.containsKey(employee.getId())) {
                duplicates.add(employee);
            } else {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for (Employee employee : duplicates) {
            employees.remove(employee);
        }

        return employees;
    }

}
