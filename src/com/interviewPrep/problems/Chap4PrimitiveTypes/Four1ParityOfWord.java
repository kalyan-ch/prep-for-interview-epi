package com.interviewPrep.problems.Chap4PrimitiveTypes;

// calculate the parity of a word
public class Four1ParityOfWord {

    public static void main(String[] args) {

        int[] nums = {16, 17, 18, 19, 20, 21};

        for(int num: nums){
            System.out.println(num+" "+parityOfWord(num));
            System.out.println(num+" "+parityOfWord1(num));
        }
    }

    private static int parityOfWord(int num) {
        return (FourBootCamp.countBits(num) % 2 == 0) ? 0 : 1;
    }

    private static int parityOfWord1(int num){
        int result = 0;
        while(num != 0){
            result ^= 1;
            num &= (num - 1);
        }
        return result;
    }

}
