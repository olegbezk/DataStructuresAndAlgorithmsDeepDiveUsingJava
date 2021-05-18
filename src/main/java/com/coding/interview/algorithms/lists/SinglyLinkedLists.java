package com.coding.interview.algorithms.lists;

public class SinglyLinkedLists {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println("Employee list is empty: " + employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(janeJones);
        employeeLinkedList.addToFront(johnDoe);
        employeeLinkedList.addToFront(marySmith);
        employeeLinkedList.addToFront(mikeWilson);

        System.out.println("Employee list is empty: " + employeeLinkedList.isEmpty());
        System.out.println("Employee list size: " + employeeLinkedList.getSize());

        employeeLinkedList.printList();

        System.out.println("Removed node: " + employeeLinkedList.removeFromFront());
        System.out.println("Employee list size: " + employeeLinkedList.getSize());

        employeeLinkedList.printList();
    }
}
