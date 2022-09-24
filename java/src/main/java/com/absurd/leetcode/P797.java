package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/***
 * 给你一个有 n 个节点的 有向无环图（DAG），请你找出所有从节点 0 到节点 n-1 的路径并输出（不要求按特定顺序）
 *
 *  graph[i] 是一个从节点 i 可以访问的所有节点的列表（即从节点 i 到节点 graph[i][j]存在一条有向边）。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：graph = [[1,2],[3],[3],[]]
 * 输出：[[0,1,3],[0,2,3]]
 * 解释：有两条路径 0 -> 1 -> 3 和 0 -> 2 -> 3
 * 示例 2：
 *
 *
 *
 * 输入：graph = [[4,3,1],[3,2,4],[3],[4],[]]
 * 输出：[[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
 *  
 *
 * 提示：
 *
 * n == graph.length
 * 2 <= n <= 15
 * 0 <= graph[i][j] < n
 * graph[i][j] != i（即不存在自环）
 * graph[i] 中的所有元素 互不相同
 * 保证输入为 有向无环图（DAG）
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/all-paths-from-source-to-target
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P797 {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(0);
        bfs(graph, 0,deque, result);
        return result;
    }

    private void bfs(int[][] graph, int start, ArrayDeque<Integer> deque, List<List<Integer>> result) {
        if (start == graph.length-1){
            result.add(new ArrayList<>(deque));
            return;
        }
        for(int i=0;i<graph[start].length;i++){
            deque.push(graph[start][i]);
            bfs(graph, graph[start][i], deque, result);
            deque.poll();
        }

    }
}