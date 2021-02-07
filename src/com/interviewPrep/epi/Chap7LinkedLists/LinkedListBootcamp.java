package com.interviewPrep.epi.Chap7LinkedLists;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.createLinkedList;
import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.printLinkedList;

public class LinkedListBootcamp {

    public static void main(String[] args) {
        ListNode head = createLinkedList(5, 10, 30);

        printLinkedList(head);

        ListNode node1 = search(5, head);

        insertNodeAfter(node1, 10);

        printLinkedList(head);

        deleteAfter(node1);

        printLinkedList(head);

    }

    public static ListNode search(int key, ListNode head){
        ListNode node = head;
        while(node != null && node.val != key){
            node = node.next;
        }
        return node;
    }

    public static void deleteAfter(ListNode node){
        if(node.next != null)
            node.next = node.next.next;
    }

    public static void insertNodeAfter(ListNode node, int val){
        ListNode newNode = new ListNode(val);
        newNode.next = node.next;
        node.next = newNode;
    }

}
