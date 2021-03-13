package com.interviewPrep.epi.Chap13Sorting;

import com.interviewPrep.epi.Chap5Arrays.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;

public class Thirteen1IntersectionOf2Arr {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for(int i = 0; i < 10; i++)
            arr1[i] = (i+1)*2;

        for(int i = 0; i < 10; i++)
            arr2[i] = (i+1)*4;


        List<Integer> intersection = findIntersection(arr1, arr2);
        printIntArr(intersection);
    }

    private static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j])
                i++;
            else if(arr1[i] > arr2[j])
                j++;
            else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        return result;
    }
}
