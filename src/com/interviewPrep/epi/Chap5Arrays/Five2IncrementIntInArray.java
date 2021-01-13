package com.interviewPrep.epi.Chap5Arrays;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;

public class Five2IncrementIntInArray {

    public static void main(String[] args) {
        int[][] arr = {{9,9,9,9}, {2,5,6}};
        for(int[] ar: arr) {
            int[] result = incrementArrayByOne(ar);
            printIntArr(result);
        }
    }

    private static int[] incrementArrayByOne(int[] arr) {

        int n = arr.length;
        arr[n-1] = arr[n - 1] + 1;

        if((arr[n - 1]) < 9){
            return arr;
        }else{
            int carry = 1;
            arr[n - 1] = 0;
            for(int i = n - 2; i >= 0; i--){
                int sum = arr[i] + carry;
                carry = (sum > 9) ? 1 : 0;
                arr[i] = sum % 10;
            }

            if(carry > 0){
                int[] result = new int[n + 1];
                result[0] = 1;
                return result;
            }

            return arr;
        }
    }

}
