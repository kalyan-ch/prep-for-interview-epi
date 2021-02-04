package com.interviewPrep.epi.Chap6Strings;

public class Six8LookAndSayProblem {
    public static void main(String[] args) {
        System.out.println(lookAndSayNumberAt(2));
        System.out.println(lookAndSayNumberAt(3));
        System.out.println(lookAndSayNumberAt(4));
    }

    public static String lookAndSayNumberAt(int n){
        String res = "1";
        for(int i = 0; i < n; i++){
            res = nextLookAndSayNumber(res);
        }
        return res;
    }

    public static String nextLookAndSayNumber(String s){
        StringBuilder res = new StringBuilder();
        for(int i= 0; i < s.length(); i++){
            int count = 1;
            while(i + 1< s.length() && s.charAt(i) == s.charAt(i+1)){
                i++;
                count++;
            }
            res.append(count);
            res.append(s.charAt(i));
        }
        return res.toString();
    }

}
