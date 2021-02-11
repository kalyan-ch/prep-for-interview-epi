package com.interviewPrep.epi.Chap8StacksAndQueues;

import com.interviewPrep.epi.Chap7LinkedLists.ListNode;

import java.util.ArrayDeque;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.createLinkedList;
import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.printLinkedList;

public class EightStackBootcamp {
    public static void main(String[] args) {
        ListNode head = createLinkedList(0, 2, 10);
        printLinkedList(head);
        printLinkedListInReverse(head);
    }

    private static void printLinkedListInReverse(ListNode head){
        ArrayDeque<ListNode> stack = new ArrayDeque<>();
        ListNode node = head;
        while(node != null){
            stack.push(node);
            node = node.next;
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop().val);
            System.out.print("->");
        }

        System.out.println();
    }
}
