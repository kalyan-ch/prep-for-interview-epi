package com.interviewPrep.epi.Chap5Arrays;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;
import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.swapArr;

// reorder array such that even numbers are ordered at start of the array
public class FiveBootCamp {

    public static void main(String[] args) {
        int[] arr= {0, 1, 2, 3, 4, 6, 2, 6, 7, 3, 5};
        evenOddOrder(arr);
        printIntArr(arr);
    }

    private static void evenOddOrder(int[] arr){
        int eve = 0, odd = arr.length-1;
        while(eve < odd){
            if((arr[eve] & 1) == 0)
                eve++;
            else{
                swapArr(arr, eve, odd--);
            }
        }
    }
}
