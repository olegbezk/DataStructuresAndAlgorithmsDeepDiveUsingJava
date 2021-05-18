package com.coding.interview.algorithms.lists.singly.linked;

import com.coding.interview.algorithms.lists.Employee;
import com.coding.interview.algorithms.lists.singly.linked.EmployeeNode;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
        System.out.println("Add a new employee: " + employee);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
