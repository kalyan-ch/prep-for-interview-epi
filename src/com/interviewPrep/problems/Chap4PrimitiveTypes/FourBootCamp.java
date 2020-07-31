package com.interviewPrep.problems.Chap4PrimitiveTypes;


// count number of set bits
public class FourBootCamp {

    public static void main(String[] args) {
        System.out.println(countBits(21));
    }

    public static int countBits(int num){
        int count = 0;
        while(num != 0){
            count += (num & 1);
            num >>>= 1;
        }
        return count;
    }

}
