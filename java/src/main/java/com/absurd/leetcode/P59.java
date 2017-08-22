package com.absurd.leetcode;

/**
 * Created by wangwenwei on 2017/8/22.
 */
public class P59 {


    /***
     *
     * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

     For example,
     Given n = 3,

     You should return the following matrix:
     [
     [ 1, 2, 3 ],
     [ 8, 9, 4 ],
     [ 7, 6, 5 ]
     ]

     * @param n
     * @return
     */
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int size = n*n;
        int i = 0;
        int j = 0;
        int iMax = n;
        int jMax = n;
        int iMin = 0;
        int jMin = 0;
        for(int count = 1;count<=size;){
            while(j<jMax&&count<=size) {matrix[i][j++] = count++;}
            j--;i++;
            iMin++;
            while(i<iMax&&count<=size) {matrix[i++][j] = count++;}
            i--;j--;
            jMax--;
            while(j>=jMin&&count<=size) {matrix[i][j--] = count++;}
            j++;i--;
            iMax--;
            while(i>=iMin&&count<=size) {matrix[i--][j] = count++;}
            i++;j++;
            jMin++;
        }

        return matrix;

    }
}
