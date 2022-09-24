package com.absurd.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 *
 *
 *  
 *
 * 示例 1:
 *
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 示例 2:
 *
 * 输入: numRows = 1
 * 输出: [[1]]
 *  
 *
 * 提示:
 *
 * 1 <= numRows <= 30
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P118 {
    public List<List<Integer>> generate(int numRows) {
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        List<List<Integer>> res = new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList();
            res.add(row);
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    int sum = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    row.add(sum);
                }

            }

        }
        return res;

    }
}
