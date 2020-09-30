package com.interviewPrep.leetcode.arraysCourse;

public class ReplaceWithMaxEleRight {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);

        for(int a: arr)
            System.out.print(a+" ");


        System.out.println();

    }

    public static int[] replaceElements(int[] arr) {

        int maxEle = -1;

        for(int i = arr.length - 1; i > 0; i--){
            int temp = arr[i];
            arr[i] = maxEle;
            maxEle = Math.max(maxEle, temp);
        }

        return arr;
    }

}
