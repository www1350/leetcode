package com.absurd.leetcode;

/**
 * @author absurd
 * @version P200.java, v 0.1 2023年09月26日 13:53 absurd
 */
public class P200 {
    /***
     * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
     *
     * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
     *
     * 此外，你可以假设该网格的四条边均被水包围。
     *
     *
     *
     * 示例 1：
     *
     * 输入：grid = [
     *   ["1","1","1","1","0"],
     *   ["1","1","0","1","0"],
     *   ["1","1","0","0","0"],
     *   ["0","0","0","0","0"]
     * ]
     * 输出：1
     * 示例 2：
     *
     * 输入：grid = [
     *   ["1","1","0","0","0"],
     *   ["1","1","0","0","0"],
     *   ["0","0","1","0","0"],
     *   ["0","0","0","1","1"]
     * ]
     * 输出：3
     *
     * [["1","1","1"],
     * ["0","1","0"],
     * ["1","1","1"]]
     *
     *
     * 提示：
     *
     * m == grid.length
     * n == grid[i].length
     * 1 <= m, n <= 300
     * grid[i][j] 的值为 '0' 或 '1'
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        int num = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                boolean isIslands = dfs(grid, i, j, visited);
                if (isIslands){
                    num++;
                }
            }
        }
        return num;

    }

    private boolean dfs(char[][] grid, int i, int j, boolean[][] visited) {
        if (i<0 || j<0||i>=grid.length || j>=grid[0].length || visited[i][j]){
            return false;
        }
        if (grid[i][j]=='0'){
            visited[i][j] = true;
            return false;
        }
        visited[i][j] = true;
        dfs(grid,i+1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j-1,visited);
        return true;
    }
}