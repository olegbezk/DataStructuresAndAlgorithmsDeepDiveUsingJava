package com.coding.interview.algorithms.queues.circular;

import com.coding.interview.algorithms.queues.Employee;

public class MainArrayQueue {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 194);

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);
        queue.remove();
        queue.add(johnDoe);

        queue.printQueue();
    }
}
