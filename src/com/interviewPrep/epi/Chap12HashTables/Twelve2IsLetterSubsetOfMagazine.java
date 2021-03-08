package com.interviewPrep.epi.Chap12HashTables;

import java.util.HashMap;
import java.util.Map;

public class Twelve2IsLetterSubsetOfMagazine {
    public static void main(String[] args) {
        String letter = "Hashset is different from a map";
        String magazine = "Hashset implements retainAll() which can be used to perform set interaction fucking fuck";

        System.out.println(isLetterSubsetOfMagz(letter, magazine));
    }

    private static boolean isLetterSubsetOfMagz(String letter, String magazine) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < letter.length(); i++) {
            char c = letter.charAt(i);
            if(c != ' '){
                int count = charMap.containsKey(c) ? charMap.get(c) : 0;
                charMap.put(c, ++count);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if(charMap.containsKey(c)) {
                int count = charMap.get(c);
                charMap.put(c, --count);
                if (count == 0)
                    charMap.remove(c);
            }
        }

        return charMap.isEmpty();
    }
}
