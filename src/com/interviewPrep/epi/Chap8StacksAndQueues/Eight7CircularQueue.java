package com.interviewPrep.epi.Chap8StacksAndQueues;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Eight7CircularQueue {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(6);
        for(int i = 1; i < 7; i++){
            cq.enqueue(i*6);
        }

        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());

        cq.enqueue(4);
        cq.enqueue(14);
        cq.enqueue(24);
        cq.enqueue(34);

        System.out.println(cq.dequeue());
    }

    static class CircularQueue{
        private int head = 0, tail = 0, numElements = 0;
        private int[] queue;
        CircularQueue(int size){
            queue = new int[size];
        }

        public void enqueue(int num){
            if(numElements == queue.length){
                head = 0;
                tail = numElements;
                queue = Arrays.copyOf(queue, numElements * 2);
            }

            queue[tail] = num;
            tail = (tail + 1) % (queue.length);
            ++numElements;
        }

        public int dequeue(){
            if(numElements != 0) {
                numElements--;
                int ele = queue[head];
                head = (head + 1) % (queue.length);
                return ele;
            }
            throw new NoSuchElementException("queue empty");
        }
    }
}
