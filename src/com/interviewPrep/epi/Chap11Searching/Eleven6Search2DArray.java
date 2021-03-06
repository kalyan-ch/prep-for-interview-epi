package com.interviewPrep.epi.Chap11Searching;

public class Eleven6Search2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 4, 5}, {1, 3, 4, 6}, {2, 4, 6, 7}, {2, 5, 8, 9}};
        int[] indices = searchForK(matrix, 3);
        System.out.println(indices[0]+" "+indices[1]);
    }

    private static int[] searchForK(int[][] matrix, int k) {
        int[] result = {-1, -1};
        int i = 0, j = matrix[0].length - 1;

        while(i < matrix.length && j > -1){
            if(k > matrix[i][j])
                i++;
            else if(k < matrix[i][j])
                j--;
            else{
                result[0] = i;
                result[1] = j;
                break;
            }
        }


        return result;
    }


}
