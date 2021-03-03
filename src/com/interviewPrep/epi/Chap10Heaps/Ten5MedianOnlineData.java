package com.interviewPrep.epi.Chap10Heaps;

import java.util.*;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;

public class Ten5MedianOnlineData {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < 20; i++){
            nums.add(r.nextInt(100));
        }

        printIntArr(nums);
        printRunningMedian(nums.iterator());
    }

    private static void printRunningMedian(Iterator<Integer> nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(20, Collections.reverseOrder());

        while(nums.hasNext()){
            int x = nums.next();
            minHeap.add(x);
            maxHeap.add(minHeap.remove());

            if(maxHeap.size() > minHeap.size()){
                minHeap.add(maxHeap.remove());
            }

            double median = (maxHeap.size() == minHeap.size()) ?
                    0.5 * (minHeap.peek() + maxHeap.peek()) : minHeap.peek();
            System.out.println(x+" "+median);
        }
    }
}
