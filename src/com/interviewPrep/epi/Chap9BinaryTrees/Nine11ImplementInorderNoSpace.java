package com.interviewPrep.epi.Chap9BinaryTrees;

import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils.createBinaryTree;
import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreesBootCamp.countNodes;

public class Nine11ImplementInorderNoSpace {
    public static void main(String[] args) {
        BinaryTreeNode root = createBinaryTree();
        inorderTraversalIterative(root);
    }

    //morris inorder tree traversal
    private static void inorderTraversalIterative(BinaryTreeNode root){
        BinaryTreeNode curr = root;

        while(curr != null){
            if(curr.left == null){
                System.out.print(curr.val+" ");
                curr = curr.right;
            }else{
                BinaryTreeNode pred = findPred(curr);
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else{
                    pred.right = null;
                    System.out.print(curr.val+" ");
                    curr = curr.right;
                }
            }
        }
        System.out.println();
    }

    private static BinaryTreeNode findPred(BinaryTreeNode node){
        BinaryTreeNode pred = node.left;
        while(pred.right != node && pred.right != null){
            pred = pred.right;
        }

        return pred;
    }
}
