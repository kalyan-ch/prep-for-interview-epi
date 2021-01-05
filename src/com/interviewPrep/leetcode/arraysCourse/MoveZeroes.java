package com.interviewPrep.leetcode.arraysCourse;

public class MoveZeroes{

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for(int n: nums){
            System.out.print(n+" ");
        }

        System.out.println();

    }

    private static void moveZeroes(int[] nums){
        int i = 0, writeIndex = 0;
        
        // write index indicates one place after the last non zero element was found
        // can be used to swap another non zero element to maintain the order
        while(i < nums.length){
            if(nums[i] != 0){
                swap(nums, writeIndex, i);
                writeIndex++;
            }
            i++;
        }
    }

    private static void swap(int[] nums, int j, int i){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}