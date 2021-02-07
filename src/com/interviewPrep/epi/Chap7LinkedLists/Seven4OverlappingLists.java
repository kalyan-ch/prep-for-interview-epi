package com.interviewPrep.epi.Chap7LinkedLists;

import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListBootcamp.search;
import static com.interviewPrep.epi.Chap7LinkedLists.LinkedListUtils.*;

public class Seven4OverlappingLists {
    public static void main(String[] args) {
        ListNode h1 = createLinkedList(4, 4, 24);
        ListNode h2 = createLinkedList(5, 5, 35);

        ListNode node = search(25, h2);
        ListNode n1 = search(20, h1);
        n1.next = node;

        printLinkedList(h1);
        printLinkedList(h2);

        ListNode intscNode = areListsOverlapping(h1, h2);

        if(intscNode != null)
            System.out.println("overlap found at: "+intscNode);
        else
            System.out.println("No Overlap found");


    }

    public static ListNode areListsOverlapping(ListNode h1, ListNode h2){
        int n = lengthList(h1), m = lengthList(h2);
        System.out.println(n+" "+m);

        if(n > m)
            h1 = advanceListByK(n-m, h1);
        else
            h2 = advanceListByK(m-n, h2);

        while(h1 != null && h2 != null && h1 != h2){
            h1 = h1.next;
            h2 = h2.next;
        }

        return h1;
    }

    private static ListNode advanceListByK(int k, ListNode h){
        while(k-- != 0){
            h = h.next;
        }
        return h;
    }
}
