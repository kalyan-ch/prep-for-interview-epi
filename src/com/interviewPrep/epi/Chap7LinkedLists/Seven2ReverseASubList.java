package com.interviewPrep.epi.Chap7LinkedLists;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.createLinkedList;
import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.printLinkedList;

public class Seven2ReverseASubList {
    public static void main(String[] args) {
        ListNode head = createLinkedList(3, 3, 40);
        printLinkedList(head);

        /*ListNode revHead = reverseSubLinkedList(head, 3, 7);
        printLinkedList(revHead);*/

        ListNode revHead = reverseSubLinkedList(head, 1, 13);
        printLinkedList(revHead);
    }

    private static ListNode reverseSubLinkedList(ListNode head, int start, int finish) {

        ListNode dummyHead = new ListNode(0, head);
        ListNode subListHead = dummyHead;
        int k = 1;
        while(k++ < start)
            subListHead = subListHead.next;

        ListNode currNode = subListHead.next;

        while(start++ <finish){
            ListNode temp = currNode.next;
            currNode.next = temp.next;
            temp.next = subListHead.next;
            subListHead.next = temp;
        }


        return dummyHead.next;
    }
}
