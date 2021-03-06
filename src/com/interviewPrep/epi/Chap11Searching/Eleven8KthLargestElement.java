package com.interviewPrep.epi.Chap11Searching;

import com.interviewPrep.epi.Chap5Arrays.ArrayUtils;

import java.util.PriorityQueue;
import java.util.Random;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.swapArr;

public class Eleven8KthLargestElement {

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};


        System.out.println(findKthLargestELementPartitioning(nums, 4));
    }

    private static int findKthLargestElementHeaps(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i: nums){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }

    private static int findKthLargestELementPartitioning(int[] nums, int k) {
        int small = 0, large = nums.length - 1, pos = nums.length - k;
        int pivot = partition(nums, small, large);
        while (small < large){
            if(pivot < pos)
                small = pivot + 1;
            else if(pivot == pos)
                return nums[pivot];
            else
                large = pivot - 1;
            pivot = partition(nums, small, large);
        }

        return -1;
    }

    private static int partition(int[] nums, int small, int large){
        Random r = new Random();

        int pivot = r.nextInt(large - small + 1) + small ;
        swapArr(nums, large, pivot);
        int smallIdx = small, curr = small;

        while(curr < large){
            if(nums[curr] <= nums[large]){
                swapArr(nums, smallIdx++, curr);
            }
            curr++;
        }

        swapArr(nums, smallIdx, large);

        return smallIdx;
    }
}
