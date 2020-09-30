package com.interviewPrep.leetcode.arraysCourse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfValueAndDoubleExists {

    public static void main(String[] args) {
        int[] arr = {0,0,6,7};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> arrMap = new HashMap();

        for(int i = 0; i < arr.length; i++)
            arrMap.put(arr[i], i);

        for(int i = 0; i < arr.length; i++){
            int doubIndex = arrMap.getOrDefault(arr[i]*2, -1);
            if(doubIndex != -1 && doubIndex != i)
                return true;
        }


        return false;
    }
}
