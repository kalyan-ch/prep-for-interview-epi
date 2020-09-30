package com.interviewPrep.leetcode.arraysCourse;

public class DeleteValueFromArray {

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 2, 5, 2, 3, 4, 3};

        int index = removeElement(nums, 3);

        for (int i = 0; i < index; i++) {
            System.out.print(nums[i]+" ");
        }

        System.out.println();

    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            while(nums[i] == val){
                deleteFromArr(nums, i);
                result++;
            }

        }

        return nums.length-result;
    }

    private static void deleteFromArr(int[] nums, int i){
        int j;
        for(j = i; j < nums.length - 1; j++){
            nums[j] = nums[j+1];
        }
        nums[j] = Integer.MAX_VALUE;
    }
}
