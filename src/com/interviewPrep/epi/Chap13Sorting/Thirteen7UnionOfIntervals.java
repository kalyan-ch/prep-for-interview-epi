package com.interviewPrep.epi.Chap13Sorting;

import com.interviewPrep.epi.Chap5Arrays.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thirteen7UnionOfIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {3, 8}, {8, 10}};
        int[][] mergedIntervals = merge(intervals);
        ArrayUtils.print2dArr(mergedIntervals);
    }

    private static int[][] merge(int[][] intervals){
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        int[] currInterval = intervals[0];
        result.add(currInterval);

        for(int[] interval: intervals){
            if(interval[0] <= currInterval[1])
                currInterval[1] = Math.max(interval[1], currInterval[1]);
            else{
                currInterval = interval;
                result.add(currInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }


}
