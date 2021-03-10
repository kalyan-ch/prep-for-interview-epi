package com.interviewPrep.epi.Chap12HashTables;

import java.util.HashSet;
import java.util.Set;

public class Twelve9LengthOfLongestInterval {
    public static void main(String[] args) {
        int[] nums = {3, -2, 7, 9, 8, 1, 2, 0, -1, 5, 8};
        System.out.println(lengthOfLongestInterval(nums));
    }

    private static int lengthOfLongestInterval(int[] nums) {
        int result = 0;
        Set<Integer> unprocessedEntries = new HashSet<>();

        for(int i : nums){
            unprocessedEntries.add(i);
        }

        while(!unprocessedEntries.isEmpty()){
            int a = unprocessedEntries.iterator().next();
            unprocessedEntries.remove(a);

            int lowerBound = a - 1;
            while(unprocessedEntries.contains(lowerBound)){
                unprocessedEntries.remove(lowerBound);
                lowerBound--;
            }

            int upperBound = a + 1;
            while(unprocessedEntries.contains(upperBound)){
                unprocessedEntries.remove(upperBound);
                upperBound++;
            }
            result = Math.max(upperBound - lowerBound - 1, result);
        }

        return result;
    }
}
