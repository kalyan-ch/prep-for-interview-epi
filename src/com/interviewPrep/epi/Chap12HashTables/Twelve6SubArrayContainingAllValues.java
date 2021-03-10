package com.interviewPrep.epi.Chap12HashTables;

import java.util.HashMap;
import java.util.Map;

public class Twelve6SubArrayContainingAllValues {
    public static void main(String[] args) {
        String[] paragraph = {"banana", "apple", "mango", "cat", "dog", "eucalyptus", "banana", "apple", "dog"};
        String[] keywords = {"dog", "banana", "apple"};
        int[] result = findSmallestSubArrCoveringAllValues(paragraph, keywords);

        for(int i = result[0]; i <= result[1]; i++){
            System.out.println(paragraph[i]);
        }
    }

    private static int[] findSmallestSubArrCoveringAllValues(String[] paragraph, String[] keywords) {

        Map<String, Integer> keywordMap = new HashMap<>();
        int[] resIdx = {-1, -1};
        int resLength = paragraph.length;

        for(int i = 0; i < keywords.length; i++){
            int num = keywordMap.getOrDefault(keywords[i], 0);
            keywordMap.put(keywords[i], ++num);
        }

        int rem = 0;

        for(String c: keywordMap.keySet()){
            rem += keywordMap.get(c);
        }

        for(int i = 0, j = 0; j < paragraph.length; j++){
            Integer keywordCount = keywordMap.get(paragraph[j]);
            if(keywordCount != null){
                keywordMap.put(paragraph[j], --keywordCount);
                if(keywordCount >= 0)
                    --rem;
            }

            while(rem == 0){
                if(j - i + 1 <= resLength){
                    resIdx[0] = i;
                    resIdx[1] = j;
                    resLength = j-i+1;
                }

                keywordCount = keywordMap.get(paragraph[i]);
                if(keywordCount != null){
                    keywordMap.put(paragraph[i], ++keywordCount);
                    if(keywordCount > 0)
                        ++rem;
                }
                i++;
            }
        }

        return resIdx;
    }
}
