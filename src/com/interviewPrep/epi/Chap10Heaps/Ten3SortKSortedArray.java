package com.interviewPrep.epi.Chap10Heaps;

import com.interviewPrep.epi.Chap5Arrays.ArrayUtils;

import java.util.PriorityQueue;

public class Ten3SortKSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, -1, 2, 6, 4, 5, 8};

        int[] result = sortAlmostSortedArr(arr, 2);

        ArrayUtils.printIntArr(result);
    }

    private static int[] sortAlmostSortedArr(int[] arr, int k) {
        int[] result = new int[arr.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int j = 0, i = 0, p = 0;
        for(i = 0; i < k; i++){
            minHeap.add(arr[i]);
        }

        j = i;
        while(j < arr.length){
            minHeap.add(arr[j++]);
            result[p++] = minHeap.poll();
        }

        while(!minHeap.isEmpty()){
            result[p++] = minHeap.poll();
        }

        return result;
    }
}
