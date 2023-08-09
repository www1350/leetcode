package com.absurd.leetcode;


import java.util.LinkedList;
import java.util.Stack;

/***
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 *
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 *
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 *
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * 示例 2：
 *
 * 输入：s = "3[a2[c]]"
 * 输出："accaccacc"
 * 示例 3：
 *
 * 输入：s = "2[abc]3[cd]ef"
 * 输出："abcabccdcdcdef"
 * 示例 4：
 *
 * 输入：s = "abc3[cd]xyz"
 * 输出："abccdcdcdxyz"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 30
 * s 由小写英文字母、数字和方括号 '[]' 组成
 * s 保证是一个 有效 的输入。
 * s 中所有整数的取值范围为 [1, 300] 
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/decode-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P394 {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        // s = "ab3[a4[cb]]2[bc]"
        // ab a cb
        // ab acbcbcbcb
        // abacbcbcbcbacbcbcbcbacbcbcbcb

        int count = 0;
        LinkedList<String> stack = new LinkedList();
        LinkedList<Integer> stackCount = new LinkedList();

        for (int i = 0;i< s.length();i++){
            // 数字
            if (Character.isDigit(s.charAt(i))){
                count = count * 10 + (s.charAt(i) - '0');
            }else if (s.charAt(i) == '['){
                stack.addLast(sb.toString());
                stackCount.addLast(count);
                sb = new StringBuilder();
                count = 0;
            } else if (s.charAt(i) == ']'){
                StringBuilder tmp = new StringBuilder();
                int curCount = stackCount.removeLast();
                for(int idx = 0; idx < curCount; idx++) {
                    tmp.append(sb);
                }
                sb = new StringBuilder(stack.removeLast() + tmp);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}
