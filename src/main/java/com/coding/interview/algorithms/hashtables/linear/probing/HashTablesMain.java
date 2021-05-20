package com.coding.interview.algorithms.hashtables.linear.probing;

import com.coding.interview.algorithms.common.Employee;

public class HashTablesMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 194);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("Smith", marySmith);

        hashTable.printHashTable();

        System.out.println("Retrieve Mike: " + hashTable.get("Wilson"));
        System.out.println("Retrieve Mary: " + hashTable.get("Smith"));

        System.out.println("Remove Mary: " + hashTable.remove("Smith"));
        System.out.println("Remove Mike: " + hashTable.remove("Wilson"));

        System.out.println("Final table view:");

        hashTable.printHashTable();
    }
}
