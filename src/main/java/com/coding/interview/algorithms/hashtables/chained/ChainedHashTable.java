package com.coding.interview.algorithms.hashtables.chained;

import com.coding.interview.algorithms.common.Employee;
import com.coding.interview.algorithms.common.StoredEmployee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);

        return hashtable[hashedKey].stream().sequential()
                .filter(storedEmployee -> storedEmployee.getKey().equals(key))
                .map(StoredEmployee::getEmployee)
                .findFirst()
                .orElse(null);
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.getKey().equals(key)) {
                break;
            }
        }

        if (employee == null || !employee.getKey().equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
        }

        return employee.getEmployee();
    }

    public void printHashTable() {
        for (int i  = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                for (StoredEmployee storedEmployee : hashtable[i]) {
                    System.out.print(storedEmployee.getEmployee());
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }

    private int hashKey(String key) {
        // return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }
}
