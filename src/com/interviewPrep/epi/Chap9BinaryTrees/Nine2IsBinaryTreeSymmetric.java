package com.interviewPrep.epi.Chap9BinaryTrees;

import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils.createBinaryTree;
import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils.createBinaryTreeSymmetric;

public class Nine2IsBinaryTreeSymmetric {
    public static void main(String[] args) {
        BinaryTreeNode root = createBinaryTreeSymmetric();
        System.out.println(isSymmetric(root));

        root = createBinaryTree();
        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(BinaryTreeNode root) {
        return root == null || checkSymmetric(root.left, root.right);
    }

    private static boolean checkSymmetric(BinaryTreeNode left, BinaryTreeNode right) {
        if(left == null && right == null)
            return true;
        else if(left != null && right != null){
            boolean status = (left.val == right.val) && checkSymmetric(left.right, right.left)
                    && checkSymmetric(left.left, right.right);
            return status;
        }

        // only one of the trees is empty - not symmetric
        return false;
    }


}
