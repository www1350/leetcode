package com.absurd.leetcode;

import java.util.*;

/***
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 *
 *  
 *
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 *
 *  
 *
 * 示例:
 *
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 *  
 *
 * 限制：
 *
 * 1 <= s 的长度 <= 8
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/zi-fu-chuan-de-pai-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P38_2 {

    public String[] permutation(String s) {
        char[] original = s.toCharArray();
        Arrays.sort(original);
        List<String> res = new ArrayList<>();
        char[] stack = new char[s.length()];
        boolean[] visited = new boolean[s.length()];
        backStack(original, res, stack, 0, visited);
        return res.toArray(new String[res.size()]);
    }

    private void backStack(char[] original, List<String> res, char[] stack ,int idxStack,boolean[] visited ) {
        if (original.length == idxStack){
            res.add(String.valueOf(stack));
            return;
        }
        for(int i=0;i<original.length;i++){
            // 剪枝，全排列选过的不能选了
            if (visited[i]){
                continue;
            }
            // 剪枝，相同元素
            if (i>0 && original[i] == original[i-1] && !visited[i-1]){
                continue;
            }
            stack[idxStack++] = original[i];
            visited[i]=true;
            backStack(original, res, stack,idxStack, visited);
            idxStack--;
            visited[i]=false;

        }

    }
}
