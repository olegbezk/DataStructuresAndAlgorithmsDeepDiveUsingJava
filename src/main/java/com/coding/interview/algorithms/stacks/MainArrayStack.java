package com.coding.interview.algorithms.stacks;

public class MainArrayStack {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ArrayStack stack = new ArrayStack(10);
        stack.push(janeJones);
        stack.push(johnDoe);

        System.out.println("Peeked employee: " + stack.peek());
        stack.push(marySmith);
        stack.printStack();

        System.out.println("Peeked employee: " + stack.peek());
        stack.push(mikeWilson);
        stack.printStack();

        System.out.println("Popped person: " + stack.pop());
        stack.printStack();
    }
}
