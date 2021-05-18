package com.coding.interview.algorithms.lists;

import java.util.LinkedList;
import java.util.List;

public class JDKLinkedList {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> employees = new LinkedList<>();
        employees.addFirst(janeJones);
        employees.addFirst(johnDoe);
        employees.addFirst(marySmith);
        employees.addFirst(mikeWilson);

        System.out.print("HEAD -> ");
        employees.forEach(employee -> System.out.print(employee + "<=>"));
        System.out.print("null" + "\n");

        Employee billEnd = new Employee("Bill", "End", 678);
        employees.add(billEnd);

        System.out.print("HEAD -> ");
        employees.forEach(employee -> System.out.print(employee + "<=>"));
        System.out.print("null" + "\n");

        employees.removeFirst();
        System.out.print("HEAD -> ");
        employees.forEach(employee -> System.out.print(employee + "<=>"));
        System.out.print("null" + "\n");

        employees.removeLast();
        System.out.print("HEAD -> ");
        employees.forEach(employee -> System.out.print(employee + "<=>"));
        System.out.print("null" + "\n");
    }
}
