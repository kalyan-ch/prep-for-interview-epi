package com.interviewPrep.epi.Chap5Arrays;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;
import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.swapArr;

// arrange array such that similar elements appear together
public class Five1DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,2,1,0,1,2};
        dutchFlag(5, arr);
        printIntArr(arr);
    }

    // use quicksort to partition the arr into three parts - smaller than, greater than and equal to pivot
    private static void dutchFlag(int pivotIdx, int[] arr) {

        int lg = arr.length, sm = 0, eq = 0;

        while(eq < lg){
            if(arr[eq] < arr[pivotIdx]){
                swapArr(arr, sm++, eq++);
            }else if(arr[eq] == arr[pivotIdx]){
                eq++;
            }else{
                swapArr(arr, eq, --lg);
            }
        }

    }

}
