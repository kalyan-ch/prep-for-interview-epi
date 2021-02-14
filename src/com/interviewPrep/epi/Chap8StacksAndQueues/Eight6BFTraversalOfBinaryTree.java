package com.interviewPrep.epi.Chap8StacksAndQueues;

import com.interviewPrep.epi.Chap5Arrays.ArrayUtils;
import com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeNode;
import com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils.insertLeft;
import static com.interviewPrep.epi.Chap9BinaryTrees.BinaryTreeUtils.insertRight;

public class Eight6BFTraversalOfBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(314);
        insertLeft(root, 6);
        insertRight(root, 88);
        insertLeft(root.left, 271);
        insertRight(root.left, 500);
        insertLeft(root.right, 2);
        insertRight(root.right, 271);

        List<List<Integer>> result = binaryTreeBFS(root);
        for(List<Integer> level: result){
            ArrayUtils.printIntArr(level);
        }
    }

    public static List<List<Integer>> binaryTreeBFS(BinaryTreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        Deque<BinaryTreeNode> currNodes = new ArrayDeque<>();
        currNodes.add(root);

        while(!currNodes.isEmpty()){
            Deque<BinaryTreeNode> nextNodes = new ArrayDeque<>();
            List<Integer> thisLevel = new ArrayList<>();

            while(!currNodes.isEmpty()) {
                BinaryTreeNode node = currNodes.poll();
                thisLevel.add(node.val);
                if (node.left != null)
                    nextNodes.add(node.left);
                if (node.right != null)
                    nextNodes.add(node.right);
            }
            result.add(thisLevel);
            currNodes = nextNodes;

        }

        return result;

    }

}
