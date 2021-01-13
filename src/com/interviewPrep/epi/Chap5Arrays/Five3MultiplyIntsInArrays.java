package com.interviewPrep.epi.Chap5Arrays;

import java.util.ArrayList;
import java.util.List;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;

public class Five3MultiplyIntsInArrays {

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {};
        List<Integer> product = multiply(num1, num2);
        printIntArr(product);
    }

    private static List<Integer> multiply(int[] num1, int[] num2) {
        List<Integer> product = new ArrayList<>();
        final int sign = ((num1[0] < 0) ^ (num2[0] < 0)) ? -1 : 1;
        num1[0] = Math.abs(num1[0]);
        num2[0] = Math.abs(num2[0]);

        
        return product;
    }

}
