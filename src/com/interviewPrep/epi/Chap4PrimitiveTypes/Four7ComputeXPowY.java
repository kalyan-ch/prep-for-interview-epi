package com.interviewPrep.epi.Chap4PrimitiveTypes;

// compute x^y without using Math library
public class Four7ComputeXPowY {
    public static void main(String[] args) {
        System.out.println(power(15, 2));
        System.out.println(power(2, -2));
        System.out.println(power(10, -4));
    }

    public static double power(double x, int y){
        double result = 1.0;
        long power = y;
        if(y < 0){
            power = -power;
            x = 1/x;
        }

        while(power != 0){

            if((power & 1) != 0)
                result *= x;

            x *= x;
            power >>>= 1;
        }

        return result;
    }
}
