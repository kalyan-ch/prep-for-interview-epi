package com.interviewPrep.epi.Chap5Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;

public class Five3MultiplyIntsInArrays {

    public static void main(String[] args) {
        int[] num1 = {2,3,4};
        int[] num2 = {5,3,1};
        List<Integer> product = multiply(num1, num2);
        printIntArr(product);

        System.out.println(multiplyStrings("2", "3"));
    }

    private static List<Integer> multiply(int[] num1, int[] num2) {

        int  n = num1.length, m = num2.length;
        List<Integer> product = new ArrayList<>(Collections.nCopies(n+m, 0));

        final int sign = ((num1[0] < 0) ^ (num2[0] < 0)) ? -1 : 1;

        num1[0] = Math.abs(num1[0]);
        num2[0] = Math.abs(num2[0]);

        for (int i = num1.length - 1; i >= 0; i--) {
            for(int j = num2.length - 1; j >= 0; j--){
                product.set(i+j+1, product.get(i+j+1) + num1[i]*num2[j]);
                product.set(i+j, product.get(i+j) + product.get(i+j+1)/10);
                product.set(i+j+1, product.get(i+j+1)%10);
            }
        }

        //remove leading zeroes

        int first_non_zero = 0;
        while(product.get(first_non_zero) == 0 && first_non_zero < product.size()){
            first_non_zero++;
        }

        product = product.subList(first_non_zero, product.size());

        if(sign < 0){
            product.set(0, -product.get(0));
        }

        return product;
    }

    private static String multiplyStrings(String num1, String num2){
        int n = num1.length(), m = num2.length();
        int[] result = new int[n+m];

        for(int i = n- 1 ; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                result[i+j+1] += (num2.charAt(j) -'0') * (num1.charAt(i) - '0');
                result[i+j] += result[i+j+1] / 10;
                result[i+j+1] %= 10;
            }
        }

        StringBuilder temp = new StringBuilder();

        int i = 0;
        while(result[i] == 0){
            i++;
        }

        while(i < result.length){
            temp.append(result[i++]);
        }

        return temp.toString();
    }

}
