package com.coding.interview.algorithms.queues.array;

import com.coding.interview.algorithms.queues.Employee;

public class MainArrayQueue {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 194);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();

        System.out.println("Peek the queue: " + queue.peek());

        System.out.println("Removed person: " + queue.remove());

        queue.printQueue();
    }
}
