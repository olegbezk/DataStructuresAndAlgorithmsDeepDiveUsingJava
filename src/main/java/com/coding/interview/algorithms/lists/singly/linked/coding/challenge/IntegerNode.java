package com.coding.interview.algorithms.lists.singly.linked.coding.challenge;

public class IntegerNode {

    private Integer number;
    private IntegerNode next;

    public IntegerNode(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
