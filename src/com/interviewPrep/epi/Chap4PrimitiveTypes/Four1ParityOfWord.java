package com.interviewPrep.epi.Chap4PrimitiveTypes;

// calculate the parity of a word
public class Four1ParityOfWord {

    public static void main(String[] args) {

        long[] nums = {162535, 17523532, 183252363, 19333535, 203334343434L, 214444444};

        /*for(long num: nums){
            System.out.println(num+" "+parityOfWord(num));
            System.out.println(num+" "+parityOfWord1(num));
            System.out.println(num+" "+parityOfWord2(num));
        }*/

        variantsFour1(155, (int)Math.pow(2, 3));

    }

    private static int parityOfWord(long num) {
        return (FourBootCamp.countBits(num) % 2 == 0) ? 0 : 1;
    }

    // result is number of times bits are cleared
    private static int parityOfWord1(long num){
        int result = 0;
        while(num != 0){
            result ^= 1;
            num &= (num - 1); // clearing lowest set bit
        }
        return result;
    }

    // parity of 16 bit word is XOR of parities of first 8-bit and second 8-bit word
    private static int parityOfWord2(long num){
        for(int i = 32; i > 0; i = i/2)
            num ^= num >>> i;

        return (int)(num & 0x1);
    }

    //variants
    public static void variantsFour1(int num, int pow2){
        System.out.println("Right propagate last set bit: " + (num | (num -1)));
        System.out.println("is " + num + " a power of 2? " + ((num & (num - 1)) == 0) );
        System.out.println(num + " mod power of 2, '" + pow2 + "' is: " + (num & (pow2 - 1)));
    }


}
