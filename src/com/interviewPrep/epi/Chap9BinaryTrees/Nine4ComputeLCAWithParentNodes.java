package com.interviewPrep.epi.Chap9BinaryTrees;

//LCA - least common ancestor
public class Nine4ComputeLCAWithParentNodes {
    public static void main(String[] args) {

    }

    static BinaryTreeNodeWithParent lca(BinaryTreeNodeWithParent n1, BinaryTreeNodeWithParent n2){
        int d1 = getDepth(n1), d2 = getDepth(n2);

        if(d2 > d1){
            BinaryTreeNodeWithParent temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int diff = Math.abs(d1 - d2);
        while(diff-- > 0){
            n1 = n1.parent;
        }

        while(n1 != n2){
            n1 = n1.parent;
            n2 = n2.parent;
        }

        return n1;

    }

    static int getDepth(BinaryTreeNodeWithParent n1){
        int depth = 0;
        while(n1.parent != null){
            depth++;
            n1 = n1.parent;
        }
        return depth;
    }
}
