package com.interviewPrep.epi.Chap10Heaps;

public class ArrayHeap {
    private int[] heap;
    private int size;

    public ArrayHeap(int size){
        size = 0;
        heap = new int[size];
    }

    public void add(int num){
        if(size >= heap.length)
            throw new IllegalStateException();

        heap[size - 1] = num;
        size++;
        heapifyUp();
    }

    private void heapifyUp(){
        
    }

    private void heapifyDown(){

    }


    public int peek(){
        if(size == 0)
            throw new IllegalStateException("heap empty");
        return heap[0];
    }

    public int poll(){
        if(size == 0)
            throw new IllegalStateException("heap empty");

        int item = heap[0];
        heap[0] = heap[size - 1];

        heapifyDown();

        size--;
        return item;
    }
}
