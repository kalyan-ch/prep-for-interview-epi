package com.interviewPrep.epi.Chap5Arrays;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;

public class Five5RemoveDupsSortedArr {
    public static void main(String[] args) {
        int[] arr = {1,1,2,6,6,7,10,10,11};
        int endIdx = removeDups(arr);
        printIntArr(arr, endIdx);

    }

    private static int removeDups(int[] arr) {
        int writeIdx = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[writeIdx - 1] != arr[i]){
                arr[writeIdx++] = arr[i];
            }
        }
        return writeIdx;
    }


}
