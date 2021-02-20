package com.interviewPrep.epi.Chap9BinaryTrees;

import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils.createBinaryTree;

public class Nine1IsBinaryTreeHeightBalanaced {

    private static class BalanceStatusWithHeight{
        public boolean balanced;
        public int height;

        public BalanceStatusWithHeight(boolean balanced, int height){
            this.balanced = balanced;
            this.height = height;
        }

    }

    public static void main(String[] args) {
        BinaryTreeNode root = createBinaryTree();
        System.out.println(isHeightBalanced(root));
    }

    static boolean isHeightBalanced(BinaryTreeNode root){
        return checkBalanced(root).balanced;
    }

    private static BalanceStatusWithHeight checkBalanced(BinaryTreeNode root){
        if(root == null)
            return new BalanceStatusWithHeight(true, -1);

        BalanceStatusWithHeight leftRes = checkBalanced(root.left);
        if(!leftRes.balanced)
            return leftRes;
        BalanceStatusWithHeight rightRes = checkBalanced(root.left);
        if(!rightRes.balanced)
            return rightRes;

        boolean isBalanced = Math.abs(leftRes.height - rightRes.height) <= 1;
        int height = Math.max(leftRes.height, rightRes.height) + 1;
        return new BalanceStatusWithHeight(isBalanced, height);
    }


}
