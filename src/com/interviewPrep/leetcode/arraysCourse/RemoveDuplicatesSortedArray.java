package com.interviewPrep.leetcode.arraysCourse;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int index = removeDupsFromArr(arr);

        for (int i = 0; i < index; i++)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

    private static int removeDupsFromArr(int[] nums) {
        int writeIndex = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[writeIndex - 1] != nums[i])
                nums[writeIndex++] = nums[i];
        }

        return writeIndex;

    }

}
