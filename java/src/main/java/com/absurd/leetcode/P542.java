package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 给定一个由 0 和 1 组成的矩阵 mat ，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
 *
 * 两个相邻元素间的距离为 1 。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：mat = [[0,0,0],[0,1,0],[0,0,0]]
 * 输出：[[0,0,0],[0,1,0],[0,0,0]]
 * 示例 2：
 *
 *
 *
 * 输入：mat = [[0,0,0],[0,1,0],[1,1,1]]
 * 输出：[[0,0,0],[0,1,0],[1,2,1]]
 *  
 *
 * 提示：
 *
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 104
 * 1 <= m * n <= 104
 * mat[i][j] is either 0 or 1.
 * mat 中至少有一个 0 
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/01-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P542 {
    public int[][] updateMatrix(int[][] mat) {
        if (mat == null){
            return mat;
        }
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visit = new boolean[mat.length][mat[0].length];
        for(int i = 0;i< mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                if (mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                    visit[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()){
            int[] searchPos = queue.poll();
            int posi = searchPos[0];
            int posj = searchPos[1];
            mark(mat,queue, posi -1, posj, mat[posi][posj]+1, visit);
            mark(mat,queue, posi , posj-1, mat[posi][posj]+1, visit);
            mark(mat,queue, posi +1, posj, mat[posi][posj]+1, visit);
            mark(mat,queue, posi , posj+1, mat[posi][posj]+1, visit);

        }

        return  mat;


    }

    private void mark(int[][] mat, Queue<int[]> queue, int posi, int posj, int newValue, boolean[][] visit) {
        if (posi < 0 || posj < 0 || posi>=mat.length ||posj>=mat[0].length|| visit[posi][posj]){
            return;
        }
        mat[posi][posj] = newValue;
        queue.offer(new int[]{posi,posj});
        visit[posi][posj] = true;

    }
}
