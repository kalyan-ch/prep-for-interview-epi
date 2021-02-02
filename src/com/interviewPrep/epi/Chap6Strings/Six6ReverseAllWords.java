package com.interviewPrep.epi.Chap6Strings;

public class Six6ReverseAllWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("sherlock holmes is polite"));
    }

    private static String reverseWords(String s){
        StringBuilder result = new StringBuilder();
        s = reverseStr(s, 0, s.length());

        int endIdx = 0, startIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                endIdx = i;
                result.append(reverseStr(s, startIdx,endIdx));
                result.append(" ");
                startIdx = i+1;
            }
        }

        result.append(reverseStr(s, startIdx, s.length()));

        return result.toString();
    }

    private static String reverseStr(String s, int start, int end) {
        StringBuilder temp = new StringBuilder();
        for(int i = end-1; i >= start; i--){
            temp.append(s.charAt(i));
        }

        return temp.toString();
    }
}
