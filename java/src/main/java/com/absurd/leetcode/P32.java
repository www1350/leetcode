package com.absurd.leetcode;

import java.util.Stack;

/***
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 * 示例 2：
 *
 * 输入：s = ")()())"
 * 输出：4
 * 解释：最长有效括号子串是 "()()"
 * 示例 3：
 *
 * 输入：s = ""
 * 输出：0
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 3 * 104
 * s[i] 为 '(' 或 ')'
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P32 {
    public int longestValidParentheses(String s) {
        // ( ( ) ) ( ( )
        // 0 1 2 3 4 5 6
        // ( ) ( )
        // 0 1 2 3
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            if ('(' == s.charAt(i)){
                stack.push(i);
            }else if ( ')' == s.charAt(i) ){
                stack.pop();
                if (stack.empty()){
                    stack.push(i);
                }else {
                    maxLength = Math.max(maxLength , i - stack.peek());
                }
            }
        }
        return maxLength;
    }
}
