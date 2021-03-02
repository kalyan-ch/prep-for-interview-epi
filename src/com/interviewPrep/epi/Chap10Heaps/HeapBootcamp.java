package com.interviewPrep.epi.Chap10Heaps;

import java.util.*;

public class HeapBootcamp {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit Vivamus tincidunt tortor massa " +
                "ut sollicitudin ante egestas a Fusce vitae nisi nisi Pellentesque habitant morbi tristique senectus " +
                "et netus et malesuada fames ac turpis egestas Vestibulum elementum hendrerit enim eu ultrices Proin " +
                "eget eleifend nunc Pellentesque mattis feugiat sodales Nullam luctus tristique enim Pellentesque " +
                "condimentum nulla et egestas consequat ante erat vestibulum urna non congue orci ante quis nisl";
        List<String> words = Arrays.asList(text.split(" "));

        List<String> longestStrings = topK(5, words.iterator());

        for(String s: longestStrings){
            System.out.println(s);
        }
    }

    private static List<String> topK(int k, Iterator<String> stringIter) {
        PriorityQueue<String> minHeap = new PriorityQueue<>(Comparator.comparing(String::length));

        while (stringIter.hasNext()){
            minHeap.add(stringIter.next());
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
}
