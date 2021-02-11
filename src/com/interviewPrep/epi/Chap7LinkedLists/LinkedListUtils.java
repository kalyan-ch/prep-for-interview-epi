package com.interviewPrep.epi.Chap7LinkedLists;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListBootcamp.insertNodeAfter;

public class LinkedListUtils {

    public static void printLinkedList(ListNode head){
        ListNode node = head;
        while(node != null){
            System.out.print(node.val+ "->");
            node = node.next;
        }

        System.out.println();
    }

    public static ListNode createLinkedList(int start, int step, int end){
        ListNode head = new ListNode(start);
        ListNode node = head;
        for(int i = start+step; i < end; i += step){
            insertNodeAfter(node, i);
            node = node.next;
        }
        return head;
    }

    static int lengthList(ListNode head){
        int length = 0;
        ListNode node = head;
        while(node != null){
            node = node.next;
            ++length;
        }
        return length;
    }


}
