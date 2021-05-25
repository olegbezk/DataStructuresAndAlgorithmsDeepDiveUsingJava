package com.coding.interview.algorithms.trees;

import com.coding.interview.algorithms.common.TreeNode;

public class Tree {

    private TreeNode root;

    public int min() {
        if (root != null) {
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.max();
        }
        return Integer.MAX_VALUE;
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
}
