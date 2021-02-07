package com.interviewPrep.epi.Chap7LinkedLists;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListBootcamp.search;
import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.createLinkedList;
import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.printLinkedList;

public class Seven3CheckIfthereIsACycle {
    public static void main(String[] args) {
        ListNode head = createLinkedList(4, 8, 32);
        printLinkedList(head);
        ListNode node = search(28, head);
        node.next = head.next;

        System.out.println(isListCyclical(head));

        ListNode head2 = createLinkedList(5, 2, 15);
        printLinkedList(head2);
        System.out.println(isListCyclical(head2));
    }

    public static boolean isListCyclical(ListNode head){
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

}
