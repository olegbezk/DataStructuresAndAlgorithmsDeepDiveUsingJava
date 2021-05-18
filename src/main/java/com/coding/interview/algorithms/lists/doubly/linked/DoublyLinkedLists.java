package com.coding.interview.algorithms.lists.doubly.linked;

import com.coding.interview.algorithms.lists.Employee;

public class DoublyLinkedLists {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList linkedList = new EmployeeDoublyLinkedList();
        linkedList.addToFront(janeJones);
        linkedList.addToFront(johnDoe);
        linkedList.addToFront(marySmith);

        System.out.println(linkedList.getSize());
        linkedList.printList();

        linkedList.addToEnd(mikeWilson);

        System.out.println(linkedList.getSize());
        linkedList.printList();

        System.out.println("Removed from the front: " + linkedList.removeFromFront());
        System.out.println(linkedList.getSize());
        linkedList.printList();

        System.out.println("Removed from the end: " + linkedList.removeFromEnd());
        System.out.println(linkedList.getSize());
        linkedList.printList();
    }
}
