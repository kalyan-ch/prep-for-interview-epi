package com.interviewPrep.leetcode.arraysCourse;

public class MoutainArray {

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5, 2, 1, 0};
        int[] arr1 = {0, 2, 3, 3};
        int[] arr2 = {0, 2, 3, 2, 1, 0};
        int[] arr3 = {0, 2};
        int[] arr4 = {0, 1, 2, 0, 3, 1, 2};
        int[] arr5 = {0, 1, 2, 3, 5};

        System.out.println("arr: "+isMountainArr(arr));
        System.out.println("arr1: "+isMountainArr(arr1));
        System.out.println("arr2: "+isMountainArr(arr2));
        System.out.println("arr3: "+isMountainArr(arr3));
        System.out.println("arr4: "+isMountainArr(arr4));
        System.out.println("arr4: "+isMountainArr(arr5));
    }

    private static boolean isMountainArr(int[] arr) {

        if(arr.length < 3)
            return false;

        int peak = 0;

        for (int i = 0; i < arr.length - 1; i++)
            if(arr[i] == arr[i+1])
                return false;

        for(int i = 0; i < arr.length; i++){
            if(arr[peak] < arr[i])
                peak = i;
        }

        for (int i = 1; i < peak; i++) {
            if(arr[i-1] >= arr[i])
                return false;
        }

        for (int i = peak+1; i < arr.length; i++) {
            if(arr[i-1] <= arr[i])
                return false;
        }

        return (peak != arr.length -1);

    }




}
