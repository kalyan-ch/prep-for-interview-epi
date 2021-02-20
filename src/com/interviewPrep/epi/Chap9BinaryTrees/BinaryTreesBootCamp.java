package com.interviewPrep.epi.Chap9BinaryTrees;

import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils.createBinaryTree;

public class BinaryTreesBootCamp {
    static void inorderTraversal(BinaryTreeNode root){
        if(root.left != null)
            inorderTraversal(root.left);
        System.out.print(root.val+" ");
        if(root.right != null)
            inorderTraversal(root.right);
    }

    static void preOrderTraversal(BinaryTreeNode root){
        System.out.print(root.val+" ");
        if(root.left != null)
            preOrderTraversal(root.left);
        if(root.right != null)
            preOrderTraversal(root.right);
    }

    static void postOrderTraversal(BinaryTreeNode root){
        if(root.left != null)
            postOrderTraversal(root.left);
        if(root.right != null)
            postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        BinaryTreeNode root = createBinaryTree();
        inorderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();

        System.out.println(countNodes(root));
    }

    public static int countNodes(BinaryTreeNode root){
        return numNodes(root);
    }

    private static int numNodes(BinaryTreeNode root){
        if(root == null)
            return 0;

        return 1 + numNodes(root.left) + numNodes(root.right);
    }


}
