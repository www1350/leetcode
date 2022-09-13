package com.absurd.leetcode;

import java.util.List;

/***
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 *
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * 输出：11
 * 解释：如下面简图所示：
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * 示例 2：
 *
 * 输入：triangle = [[-10]]
 * 输出：-10
 *  
 *
 * 提示：
 *
 * 1 <= triangle.length <= 200
 * triangle[0].length == 1
 * triangle[i].length == triangle[i - 1].length + 1
 * -104 <= triangle[i][j] <= 104
 *  
 *
 * 进阶：
 *
 * 你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        /***
         *  2
         *  3 4
         *  6 5 7
         *  4 1 8 3
         *  100 100 100 1
         *
         *  2
         *  5 6
         *  11 10 13
         *  15 11 18 16
         */
        // 只能移动到i或者i+1,dp表示当前位置最大,
        // 状态转移dp(i) = min{dp(i-1)+nums[i], dp(i)+nums[i]},
        // i==0 dp(0)+nums[0] ;i==nums.length dp(i)=dp(i-1)+nums[i]
        // 这里注意不规则数组，每次最后一个元素取dp(i)都是0，直接取dp(i-1)+nums[i]
        // 第一个元素是dp(0)取dp(i)+nums[i]
        if (triangle.size() == 0){
            return 0;
        }
        int[] dp = new int[triangle.size()];
        dp[0] = triangle.get(0).get(0);
        for(int i = 1;i< triangle.size();i++){
            List<Integer> line = triangle.get(i);
            for (int j = line.size() -1 ;j>=0;j--){
                if(j == 0){
                    dp[j] = dp[j] + line.get(j);
                }else if(j == line.size() -1){
                    dp[j] = dp[j-1]+line.get(j);
                }else {
                    dp[j] = Math.min(dp[j-1]+line.get(j), dp[j]+line.get(j));
                }
            }
        }
        int min = dp[0];
        for (int i = 0;i<dp.length;i++){
            min = Math.min(min, dp[i]);
        }
        return min;

    }
}
