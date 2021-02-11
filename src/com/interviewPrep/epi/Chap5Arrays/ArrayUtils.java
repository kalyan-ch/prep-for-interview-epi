package com.interviewPrep.epi.Chap5Arrays;

import java.util.List;

public class ArrayUtils {

    public static void printIntArr(int[] arr){
        if(arr.length > 0)
            for (int i: arr)
                System.out.print(i+" ");
        else
            System.out.println("[]");

        System.out.println();
    }

    public static void printIntArr(int[] arr, int end){
        for (int i = 0; i < end; i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    public static void printIntArr(List<Integer> arr){
        if(!arr.isEmpty())
            for (int i: arr)
                System.out.print(i+" ");
        else
            System.out.println("[]");

        System.out.println();
    }


    public static void swapArr(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
