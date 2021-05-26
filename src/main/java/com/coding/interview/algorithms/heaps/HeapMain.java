package com.coding.interview.algorithms.heaps;

public class HeapMain {

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(68);
        heap.insert(60);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        System.out.println(heap.peek());

        heap.printHeap();

        heap.sort();

        System.out.println("Heapsort");

        heap.printHeap();

//        heap.delete(1);
//
//        heap.printHeap();
//
//        heap.delete(5);
//
//        heap.printHeap();
//
//        heap.delete(0);
//
//        heap.printHeap();
//
//        System.out.println(heap.peek());
    }
}
