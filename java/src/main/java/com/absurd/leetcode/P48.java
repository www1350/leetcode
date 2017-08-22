package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/rotate-image/description/
 * Created by wangwenwei on 17/8/9.
 */
public class P48 {
    /***
     * You are given an n x n 2D matrix representing an image.

     Rotate the image by 90 degrees (clockwise).

     Follow up:
     Could you do this in-place?
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                arr[j][matrix.length-i-1] = matrix[i][j];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
