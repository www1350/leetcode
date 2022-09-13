package com.absurd.leetcode;

import java.util.*;

/***
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 4, k = 2
 * 输出：
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * 示例 2：
 *
 * 输入：n = 1, k = 1
 * 输出：[[1]]
 *  
 *
 * 提示：
 *
 * 1 <= n <= 20
 * 1 <= k <= n
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(k>n){
            return res;
        }

        Deque<Integer> path = new ArrayDeque();
        // 1 --> 2-->3
        // 1--> 2--->4
        // 2--> 3-->4
        // 往下深度，拿到了回溯，弹出最后一个
        dfs(n,k,1,path,res);
        return res;

    }

    private void dfs(int n, int k, int start, Deque<Integer> path, List<List<Integer>> res) {
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<=n;i++){
            path.add(i);
            dfs(n,k,i+1,path,res);
            path.removeLast();
        }
    }
}
