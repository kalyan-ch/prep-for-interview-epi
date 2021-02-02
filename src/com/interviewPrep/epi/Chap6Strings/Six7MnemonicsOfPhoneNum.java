package com.interviewPrep.epi.Chap6Strings;

public class Six7MnemonicsOfPhoneNum {
    public static void main(String[] args) {
        String[] words = phoneMnemonics(5543);
    }

    private static String[] phoneMnemonics(int num){
        String[] words = {};

        String[] mapping = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            //char c = mapping[numStr.charAt(i)- '0'].charAt(j);
        }

        return words;
    }

}
