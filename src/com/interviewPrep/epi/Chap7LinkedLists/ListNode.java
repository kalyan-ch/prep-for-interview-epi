package com.interviewPrep.epi.Chap7LinkedLists;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x){
        this.val = x;
    }

    public ListNode(int x, ListNode next){
        this.val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        return "val = "+val+" ";
    }
}
