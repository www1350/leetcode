package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/***
 * 给你一个 n x n 的二进制矩阵 grid 中，返回矩阵中最短 畅通路径 的长度。如果不存在这样的路径，返回 -1 。
 *
 * 二进制矩阵中的 畅通路径 是一条从 左上角 单元格（即，(0, 0)）到 右下角 单元格（即，(n - 1, n - 1)）的路径，该路径同时满足下述要求：
 *
 * 路径途经的所有单元格都的值都是 0 。
 * 路径中所有相邻的单元格应当在 8 个方向之一 上连通（即，相邻两单元之间彼此不同且共享一条边或者一个角）。
 * 畅通路径的长度 是该路径途经的单元格总数。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：grid = [[0,1],[1,0]]
 * 输出：2
 * 示例 2：
 *
 *
 * 输入：grid = [[0,0,0],[1,1,0],[1,1,0]]
 * 输出：4
 * 示例 3：
 *
 * 输入：grid = [[1,0,0],[1,1,0],[1,1,0]]
 * 输出：-1
 *  
 *
 * 提示：
 *
 * n == grid.length
 * n == grid[i].length
 * 1 <= n <= 100
 * grid[i][j] 为 0 或 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/shortest-path-in-binary-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid== null || grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1){
            return -1;
        }
        int[][] moves = new int[][]{{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
        Deque<int[]> deque = new ArrayDeque<>();
        deque.push(new int[]{0,0,1});
        grid[0][0] = 1;
        while (!deque.isEmpty() ){
            int dequeSize = deque.size();
            for(int i=0;i<dequeSize;i++){
                int[] posArr = deque.poll();
                if (posArr[0] == grid.length-1 && posArr[1] == grid[0].length-1){
                    return posArr[2];
                }
                for (int[] move : moves) {
                    int posX =posArr[0] + move[0];
                    int posY =posArr[1] + move[1];
                    if(posX >= grid.length || posX<0 || posY >= grid[0].length || posY<0){
                        continue;
                    }
                    if (grid[posX][posY] == 1){
                        continue;
                    }
                    deque.offer(new int[]{posX,posY,posArr[2]+1});
                    grid[posX][posY] = 1;
                }
            }
        }
        return -1;


    }
}
