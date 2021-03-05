package com.interviewPrep.epi.Chap11Searching;

public class Eleven4IntegerSquareRoot {
    public static void main(String[] args) {
        for (int i = 10; i < 10000000; i *= 10)
            System.out.println(lessSquareRoot(i));

    }

    private static int lessSquareRoot(int k) {
        int result = 0, r = 0, l = k;

        while(r <= l){
            int m = (r + l) /2;
            if(m * m > k)
                l = m - 1;
            else if(m * m < k){
                r = m + 1;
                result = m;
            }else{
                result = m;
                break;
            }
        }

        return result;
    }
}
