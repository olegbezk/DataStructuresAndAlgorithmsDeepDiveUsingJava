package com.coding.interview.algorithms.hashtables;

import com.coding.interview.algorithms.common.Employee;

public class SimpleHashTable {

    public Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry, there is already employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);
        return hashtable[hashKey];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
