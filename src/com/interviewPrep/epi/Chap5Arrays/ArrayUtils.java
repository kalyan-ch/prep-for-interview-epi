package com.interviewPrep.epi.Chap5Arrays;

import java.util.List;

public class ArrayUtils {

    public static void printIntArr(int[] arr){
        for (int i: arr)
            System.out.print(i+" ");

        System.out.println();
    }

    public static void printIntArr(List<Integer> arr){
        for (int i: arr)
            System.out.print(i+" ");

        System.out.println();
    }


    public static void swapArr(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
