package com.interviewPrep.epi.Chap12HashTables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Twelve5NearestRepeatedEntries {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("All work and no play makes for no work no fun and no results".split(" "));
        System.out.println(findNearestRepitition(words));
    }

    private static int findNearestRepitition(List<String> words) {
        int nearestDistance = Integer.MAX_VALUE;
        Map<String, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            if(lastIndexMap.containsKey(w)){
                nearestDistance = Math.min(nearestDistance, i - lastIndexMap.get(w));
            }
            lastIndexMap.put(w, i);
        }

        return nearestDistance;
    }
}
