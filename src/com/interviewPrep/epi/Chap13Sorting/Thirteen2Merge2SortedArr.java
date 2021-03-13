package com.interviewPrep.epi.Chap13Sorting;

import com.interviewPrep.epi.Chap5Arrays.ArrayUtils;

public class Thirteen2Merge2SortedArr {
    public static void main(String[] args) {
        int[] arr1 = {3, 9, 27, 81};
        int[] arr2 = {2, 8, 27, 128};

        int[] merged = merge(arr1, arr2);
        ArrayUtils.printIntArr(merged);
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(i < arr1.length || j < arr2.length){

            int num1 = i < arr1.length ? arr1[i] : Integer.MAX_VALUE;
            int num2 = j < arr2.length ? arr2[j] : Integer.MAX_VALUE;

            if(num1 <= num2){
                result[k++] = num1;
                i++;
            }else{
                result[k++] = num2;
                j++;
            }
        }

        return result;
    }
}
