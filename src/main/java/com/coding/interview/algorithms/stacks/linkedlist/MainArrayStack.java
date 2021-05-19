package com.coding.interview.algorithms.stacks.linkedlist;

import com.coding.interview.algorithms.stacks.Employee;

public class MainArrayStack {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 194);

        LinkedListStack stack = new LinkedListStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        stack.printStack();

        System.out.println("Peeked person: " + stack.peek());

        System.out.println("Popped person: " + stack.pop());

        stack.printStack();
    }
}
