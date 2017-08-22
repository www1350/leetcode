package com.absurd.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwenwei on 2017/8/22.
 */
public class P54 {

    /***
     *
     Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

     For example,
     Given the following matrix:

     [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
     ]
     You should return [1,2,3,6,9,8,7,4,5].
     (0,0) (0,1) (0,2) (1,2) (2,2) (2,1) (2,0) (1,0) (1,1)
     j++ i++ j-- i--


     [
     [ 1, 2, 3, 4 ],
     [ 5, 6, 7, 8],
     [ 9, 10, 11, 12 ],
     [ 13, 14, 15, 16 ]
     ]
     (0,0) (0,1) (0,2) (0,3) (1,3) (2,3) (3,3) (3,2) (3,1) (3,0) (2,0) (1,0) (1,1) (1,2) (2,2) (2,1)
              j++                 i++              j--               i--         j++      i++      j--
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        if (rows == 0) return list;
        int cols = matrix[0].length;
        int size = rows * cols;
        int i = 0;
        int j = 0;
        int iMax = rows;
        int jMax = cols;
        int iMin = 0;
        int jMin = 0;
        for(int count = 0;count<size;){
            while(j<jMax&&count<size) {list.add(matrix[i][j++]);count++;}
            j--;i++;
            iMin++;
            while(i<iMax&&count<size) {list.add(matrix[i++][j]);count++;}
            i--;j--;
            jMax--;
            while(j>=jMin&&count<size) {list.add(matrix[i][j--]);count++;}
            j++;i--;
            iMax--;
            while(i>=iMin&&count<size) {list.add(matrix[i--][j]);count++;}
            i++;j++;
            jMin++;
        }
        return list;

    }
}
