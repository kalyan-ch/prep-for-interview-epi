package com.interviewPrep.epi.Chap10Heaps;

import com.interviewPrep.epi.Chap5Arrays.ArrayUtils;

import java.util.PriorityQueue;

public class Ten1MergeSortedFiles {
    public static void main(String[] args) {
        int[][] sortedArrs = {{3, 6, 15}, {2, 5, 8}, {9, 11, 16, 17}};
        int[] mergedArr = mergeSortedArrs(sortedArrs);

        ArrayUtils.printIntArr(mergedArr);
    }

    private static int[] mergeSortedArrs(int[][] sortedArrs) {
        int totalLength = getTotalLength(sortedArrs);
        int numArr = sortedArrs.length;
        int[] result = new int[totalLength];
        PriorityQueue<HeapEntry> minHeap = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.value, o2.value));
        int k = 0;

        int[] iters = new int[numArr];

        for(int i = 0; i < numArr; i++){
            minHeap.add(new HeapEntry(sortedArrs[i][0], i));
        }

        while(!minHeap.isEmpty()){
            HeapEntry minEntry = minHeap.poll();
            result[k++] = minEntry.value;

            int arrayIdx = iters[minEntry.arrayId];
            iters[minEntry.arrayId] = ++arrayIdx;

            if(arrayIdx < sortedArrs[minEntry.arrayId].length){
                minHeap.add(new HeapEntry(sortedArrs[minEntry.arrayId][arrayIdx], minEntry.arrayId));
            }

        }

        return result;
    }

    private static int getTotalLength(int[][] sortedArrs){
        int length = 0;

        for(int i = 0; i< sortedArrs.length; i++){
            for(int j = 0; j < sortedArrs[i].length; j++){
                length++;
            }
        }

        return length;
    }

    private static class HeapEntry{
        public Integer value;
        public Integer arrayId;

        public HeapEntry(Integer value, Integer arrayId){
            this.value = value;
            this.arrayId = arrayId;
        }

    }

}
