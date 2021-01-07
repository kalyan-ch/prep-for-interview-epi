package com.interviewPrep.epi.Chap4PrimitiveTypes;

import java.util.Random;

// reverse an integer
public class Four8ReverseDigits {

    public static void main(String[] args) {
        System.out.println(reverseInt((new Random()).nextInt(4144)));
    }

    private static int reverseInt(int i) {

        int result = 0;
        boolean isNegative = false;
        if(i < 0){
            i = -i;
            isNegative = true;
        }

        while(i != 0){
            int lastDigit = i % 10;
            result *= 10;
            result += lastDigit;
            i = i/10;
        }

        return isNegative ? -result : result;
    }


}
