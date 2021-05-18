package com.coding.interview.algorithms.lists.doubly.linked;

import com.coding.interview.algorithms.lists.Employee;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
        System.out.println("Add to the front the new employee: " + employee);
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        if (isEmpty()) {
            return false;
        }

        EmployeeNode temp = head;

        while (temp != null && !temp.getEmployee().equals(existingEmployee)) {
            temp = temp.getNext();
        }

        if (temp == null) {
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);

        newNode.setPrevious(temp.getPrevious());
        newNode.setNext(temp);
        temp.setPrevious(newNode);

        if (temp == head) {
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;

        return true;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrevious(tail);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
        System.out.println("Add to the tail the new employee: " + employee);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public EmployeeNode removeFromFront() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public EmployeeNode removeFromEnd() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("TAIL -> null");
    }
}
