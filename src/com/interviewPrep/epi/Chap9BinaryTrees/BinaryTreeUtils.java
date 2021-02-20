package com.interviewPrep.epi.Chap9BinaryTrees;

public class BinaryTreeUtils {

    public static void insertLeft(BinaryTreeNode node, int val){
        node.left = new BinaryTreeNode(val);
    }

    public static void insertRight(BinaryTreeNode node, int val){
        node.right = new BinaryTreeNode(val);
    }

    public static BinaryTreeNode createBinaryTree(){
        BinaryTreeNode root = new BinaryTreeNode(314);
        insertLeft(root, 6);
        insertRight(root, 88);
        insertLeft(root.left, 271);
        insertRight(root.left, 500);
        insertLeft(root.right, 2);
        return root;
    }

    public static BinaryTreeNode createBinaryTreeSymmetric(){
        BinaryTreeNode root = new BinaryTreeNode(50);
        insertLeft(root, 30);
        insertRight(root, 30);
        insertLeft(root.left, 25);
        insertRight(root.left, 15);
        insertLeft(root.right, 15);
        insertRight(root.right, 25);
        return root;
    }
}
