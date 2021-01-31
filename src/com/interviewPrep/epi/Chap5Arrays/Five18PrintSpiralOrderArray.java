package com.interviewPrep.epi.Chap5Arrays;

public class Five18PrintSpiralOrderArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSpiralOrder(matrix);
    }

    static void printSpiralOrder(int[][] matrix){
        int[][] shift = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int i = 0, j = 0, k = 0, n = matrix.length, m = matrix[0].length, dir = 0;


        while(k < n*m){
            System.out.print(matrix[i][j]+" ");
            matrix[i][j] = 0;

            int nextI = i + shift[dir][0];
            int nextJ = j + shift[dir][1];

            if(nextI >= n || nextI < 0 || nextJ >=m || nextJ < 0 || matrix[nextI][nextJ] == 0){
                dir = (dir+1)%4;
                nextI = i + shift[dir][0];
                nextJ = j + shift[dir][1];
            }

            i = nextI; j = nextJ; k++;
        }

    }
}
