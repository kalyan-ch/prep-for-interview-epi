package com.interviewPrep.epi.Chap6Strings;

public class Six2BaseConversion {
    public static void main(String[] args) {
        System.out.println(convertIntoBase("ABF", 16, 2));
    }

    private static String convertIntoBase(String numStr, int b1, int b2){
        StringBuilder result = new StringBuilder();
        int numInBase10 = 0, n = numStr.length();

        for(int i = n - 1; i >= 0; i--){
            char c = numStr.charAt(i);
            if(Character.isDigit(c)){
                numInBase10 += (int)(Math.pow(b1, n-i-1)) * (c-'0');
            }else{
                numInBase10 += (int)(Math.pow(b1, n-i-1)) * (c-'A'+10);
            }
        }

        if(b2 != 10)
            while(numInBase10 != 0){
                result.append(numInBase10 % b2);
                numInBase10 = numInBase10/b2;
            }

        return result.reverse().toString();
    }

}
