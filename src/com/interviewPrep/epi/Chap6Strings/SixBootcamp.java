package com.interviewPrep.epi.Chap6Strings;

public class SixBootcamp {
    public static void main(String[] args) {
        String[] arr = {"tacocat", "pacocap", "masakali", "catoitac"};
        for(String s: arr)
            System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
