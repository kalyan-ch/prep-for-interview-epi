package com.interviewPrep.epi.Chap4PrimitiveTypes;

//reverse bits of a number
public class Four3ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(16L));
        System.out.println((long)Math.pow(2, 59));
    }

    public static long reverseBits(long num){
        int i = 63, j = 0;

        while(j <= i){
            int bit1 = (int)((num >>> i) & 1);
            int bit2 = (int)((num >>> j) & 1);

            if(bit1 != bit2){
                num ^= (1L << i);
                num ^= (1L << j);
            }
            j++;
            i--;
        }

        return num;
    }
}
