package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/***
 * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "ab#c", t = "ad#c"
 * 输出：true
 * 解释：s 和 t 都会变成 "ac"。
 * 示例 2：
 *
 * 输入：s = "ab##", t = "c#d#"
 * 输出：true
 * 解释：s 和 t 都会变成 ""。
 * 示例 3：
 *
 * 输入：s = "a#c", t = "b"
 * 输出：false
 * 解释：s 会变成 "c"，但 t 仍然是 "b"。
 *  
 *
 * 提示：
 *
 * 1 <= s.length, t.length <= 200
 * s 和 t 只含有小写字母以及字符 '#'
 *  
 *
 * 进阶：
 *
 * 你可以用 O(n) 的时间复杂度和 O(1) 的空间复杂度解决该问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/backspace-string-compare
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P844_2 {
    public boolean backspaceCompare(String s, String t) {
        // s = "ab#c", t = "ad#c"
        // 反向找，如果遇到回退往前跳
        int sLast = s.length() - 1;
        int skipS = 0;
        int tLast = t.length() - 1;
        int skipT = 0;
        while ((sLast >= 0) || (tLast>=0)){
            while(sLast >=0){
                if (s.charAt(sLast) == '#'){
                    skipS++;
                    sLast--;
                }else if (skipS>0){
                    sLast--;
                    skipS--;
                }else {
                    break;
                }
            }
            while(tLast >=0){
                if (t.charAt(tLast) == '#') {
                    skipT++;
                    tLast--;
                }else if(skipT>0){
                    tLast--;
                    skipT--;
                }else {
                    break;
                }
            }

            if (sLast >=0 && tLast>=0) {
                if (s.charAt(sLast) != t.charAt(tLast)) {
                    return false;
                }
            }else {

                return sLast == tLast;
            }
            sLast--;
            tLast--;

        }
        return true;

    }
}
