package com.interviewPrep.epi.Chap6Strings;

public class Six1StringAnIntConversion {
    public static void main(String[] args) {
        for(int i = -100; i < 100; i+=5)
            System.out.print(convertToString(i)+" ");

        System.out.println();

        String[] nums = {"145", "999978", "-443"};
        for(String n: nums)
            System.out.print(convertToInt(n)+" ");

        System.out.println();

    }

    private static int convertToInt(String s) {
        int result = 0;
        boolean isNegative = false;
        if(s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
        }
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if(c > 9)
                break;
            result = result * 10 + c;
        }

        return isNegative ? -result: result;
    }

    public static String convertToString(int n){
        int sign = 1;
        if(n< 0){
            sign = -1;
            n = -n;
        }

        String result = "";

        int numDigits = (int)(Math.floor(Math.log10(n))) + 1;
        int mask = (int)Math.pow(10, numDigits-1);

        while(n != 0 || mask != 0){
            int digit = n / mask;
            result += digit;
            n = n % mask;
            mask = mask/10;
        }

        return sign < 0 ? "-"+result : result;
    }


}
