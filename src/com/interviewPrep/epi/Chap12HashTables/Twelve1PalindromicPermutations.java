package com.interviewPrep.epi.Chap12HashTables;

import java.util.HashSet;
import java.util.Set;

public class Twelve1PalindromicPermutations {
    public static void main(String[] args) {
        String[] arr = {"edified", "mom", "daed"};
        for(String s: arr)
            System.out.println(canFormPalindrome(s));
    }

    private static boolean canFormPalindrome(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(charSet.contains(c))
                charSet.remove(c);
            else
                charSet.add(c);
        }
        return charSet.size() <= 1;
    }
}
