package com.coding.interview.algorithms.hashtables;

import com.coding.interview.algorithms.common.Employee;

import java.util.HashMap;
import java.util.Map;

public class JDKHashMap {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 194);

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        hashMap.put("Wilson", mikeWilson);

        Employee wilson = hashMap.putIfAbsent("Wilson", billEnd);

        System.out.println(wilson);

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

        System.out.println("\n" + hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));

        System.out.println(hashMap.getOrDefault("someone", mikeWilson));
    }
}
