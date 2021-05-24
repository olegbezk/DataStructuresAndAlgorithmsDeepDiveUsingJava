package com.coding.interview.algorithms.hashtables.chained;

import com.coding.interview.algorithms.common.Employee;

public class ChainedHashTableMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 194);

        ChainedHashTable hashTable = new ChainedHashTable();
        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Smith", marySmith);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("End", billEnd);

        hashTable.printHashTable();

        System.out.println("\n" + "Retrieve Mary: " + hashTable.get("Smith") + "\n");

        hashTable.remove("Doe");
        hashTable.remove("Jones");

        hashTable.printHashTable();

        System.out.println("\n" + "Retrieve Mary: " + hashTable.get("Smith")  + "\n");
    }
}
