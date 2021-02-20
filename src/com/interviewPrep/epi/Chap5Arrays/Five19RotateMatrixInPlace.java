package com.interviewPrep.epi.Chap5Arrays;

public class Five19RotateMatrixInPlace {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(matrix);
        ArrayUtils.print2dArr(matrix);
    }

    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < (matrix.length + 1) / 2; i++) {
            for (int j = i; j < n - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j][i];
                matrix[n-j][i] = matrix[n-i][n-j];
                matrix[n-i][n-j] = matrix[j][n-i];
                matrix[j][n-i] = temp;
            }
        }
    }
}
