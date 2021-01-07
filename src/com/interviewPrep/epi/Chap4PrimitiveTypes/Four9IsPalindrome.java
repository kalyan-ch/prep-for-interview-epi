package com.interviewPrep.epi.Chap4PrimitiveTypes;

public class Four9IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isDecimalIntegerPalindrome(952259));
    }

    public static boolean isDecimalIntegerPalindrome(int num){
        if(num < 0)
            return false;

        int n = (int)Math.floor(Math.log10(num)) + 1;
        int msdMask = (int)Math.pow(10, n-1);
        while(num > 0){
            if((num % 10) != (num / msdMask))
                return false;

            num %= msdMask; // remove left most digit
            num /= 10; // remove right most digit
            msdMask /= 100;
        }

        return true;
    }

}
