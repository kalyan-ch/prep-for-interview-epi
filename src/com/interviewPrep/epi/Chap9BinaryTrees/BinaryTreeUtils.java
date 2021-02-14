package com.interviewPrep.epi.Chap9BinaryTrees;

public class BinaryTreeUtils {

    public static void insertLeft(BinaryTreeNode node, int val){
        node.left = new BinaryTreeNode(val);
    }

    public static void insertRight(BinaryTreeNode node, int val){
        node.right = new BinaryTreeNode(val);
    }
}
