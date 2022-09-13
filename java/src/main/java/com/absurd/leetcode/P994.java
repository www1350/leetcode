package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/***
 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：
 *
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。
 *
 * 返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：grid = [[2,1,1],[1,1,0],[0,1,1]]
 * 输出：4
 * 示例 2：
 *
 * 输入：grid = [[2,1,1],[0,1,1],[1,0,1]]
 * 输出：-1
 * 解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
 * 示例 3：
 *
 * 输入：grid = [[0,2]]
 * 输出：0
 * 解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
 *  
 *
 * 提示：
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 10
 * grid[i][j] 仅为 0、1 或 2
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rotting-oranges
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P994 {

    public int orangesRotting(int[][] grid) {
        if (grid == null){
            return 0;
        }
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                    visit[i][j] = true;
                }
            }
        }

        int count = queue.isEmpty() ? 1:0;

        while (!queue.isEmpty()){
            int qsize = queue.size();
            count++;
            for(int i = 0 ; i < qsize;i++) {
                int[] pos = queue.poll();
                int posi = pos[0];
                int posj = pos[1];
                mark(grid, queue, posi - 1, posj, visit);
                mark(grid, queue, posi, posj -1, visit);
                mark(grid, queue, posi + 1, posj, visit);
                mark(grid, queue, posi , posj+1, visit);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return count-1;
    }

    private void mark(int[][] grid, Queue<int[]> queue, int posi, int posj, boolean[][] visit) {
        if (posi < 0 || posj < 0 || posi>=grid.length ||posj>=grid[0].length|| visit[posi][posj] || grid[posi][posj] == 0){
            return;
        }
        grid[posi][posj] = 2;
        queue.offer(new int[]{posi,posj});
        visit[posi][posj] = true;

    }
}
