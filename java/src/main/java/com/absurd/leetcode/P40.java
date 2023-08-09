package com.absurd.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/***
 * 给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用 一次 。
 *
 * 注意：解集不能包含重复的组合。 
 *
 *  
 *
 * 示例 1:
 *
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 输出:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 输出:
 * [
 * [1,2,2],
 * [5]
 * ]
 *  
 *
 * 提示:
 *
 * 1 <= candidates.length <= 100
 * 1 <= candidates[i] <= 50
 * 1 <= target <= 30
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/combination-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // 10,1,2,7,6,1,5
        // 1,1,2,5,6,7,10
        Arrays.sort(candidates);
        backStack(res, deque, candidates, target, 0 ,0);
        return res;
    }

    private void backStack(List<List<Integer>> res, ArrayDeque<Integer> deque, int[] candidates, int target, int sum, int start) {
        if (target == sum) {
            res.add(new ArrayList<>(deque));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            // 剪枝
            if (sum > target){
                break;
            }
            // 1,1,2,5,6,7,10
            // 1/1(剪枝)--2---5
            if (i>0 && candidates[i]==candidates[i-1]){
                continue;
            }
            deque.addLast(candidates[i]);
            backStack(res, deque, candidates,target,sum+candidates[i],i+1);
            deque.removeLast();

        }
    }
}
