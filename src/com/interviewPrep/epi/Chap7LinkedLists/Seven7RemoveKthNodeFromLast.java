package com.interviewPrep.epi.Chap7LinkedLists;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.*;

public class Seven7RemoveKthNodeFromLast {
    public static void main(String[] args) {
        ListNode head = createLinkedList(2,2, 16);
        printLinkedList(head);
        for (int i = 1; i < 5; i++) {
            ListNode nH = removeKthFromLast(head, i);
            printLinkedList(nH);
        }

    }

    public static ListNode removeKthFromLast(ListNode head, int k){
        int n = lengthList(head) - k;
        if(n < 0)
            return head;

        ListNode dH = new ListNode(0, head);
        ListNode node = dH;
        int i = 0;
        while(i++ < n){
            node = node.next;
        }

        node.next = node.next.next;

        return dH.next;

    }

}
