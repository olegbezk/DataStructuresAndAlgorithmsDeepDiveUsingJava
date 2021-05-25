package com.coding.interview.algorithms.trees;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        tree.traverseInOrder();
        System.out.println();

        System.out.println(tree.get(27));
        System.out.println(tree.get(17));
        System.out.println(tree.get(888));

        System.out.println(tree.min());
        System.out.println(tree.max());

        // Case 1:
        tree.delete(15);
        tree.traverseInOrder();
        System.out.println();

        tree.delete(27);

        // Case 2:
        tree.traverseInOrder();
        System.out.println();

        // Case 3:
        tree.delete(25);
        tree.traverseInOrder();
        System.out.println();

        // Delete not existing in the tree value
        tree.delete(8888);
        tree.traverseInOrder();
    }
}
