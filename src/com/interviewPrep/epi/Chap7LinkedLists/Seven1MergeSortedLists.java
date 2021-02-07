package com.interviewPrep.epi.Chap7LinkedLists;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.createLinkedList;
import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.printLinkedList;

public class Seven1MergeSortedLists {
    public static void main(String[] args) {
        ListNode head1 = createLinkedList(5, 5, 35);
        ListNode head2 = createLinkedList(6, 6, 40);

        printLinkedList(head1);
        printLinkedList(head2);
        ListNode head3 = mergeSortedLists(head1, head2);
        printLinkedList(head3);
    }

    public static ListNode mergeSortedLists(ListNode h1, ListNode h2){
        ListNode dummyHead = new ListNode(0);
        ListNode currNode = dummyHead;
        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                currNode.next = h1;
                h1 = h1.next;
            }else{
                currNode.next = h2;
                h2 = h2.next;
            }

            currNode = currNode.next;
        }

        currNode.next = h1 != null ? h1: h2;
        return dummyHead.next;
    }


}
