package com.coding.interview.algorithms.lists.singly.linked.coding.challenge;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void insertSorted(Integer number) {

        if (head == null || head.getNumber() >= number) {
            addToFront(number);
            return;
        }
        // find insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while (current != null && current.getNumber() < number) {
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(number);

        if (current != null) {
            newNode.setNext(current);
        }

        previous.setNext(newNode);
        size++;
    }

    public void addToFront(Integer number) {
        IntegerNode node = new IntegerNode(number);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {

        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = this.head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
