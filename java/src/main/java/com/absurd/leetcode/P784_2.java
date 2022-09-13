package com.absurd.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 * 给定一个字符串 s ，通过将字符串 s 中的每个字母转变大小写，我们可以获得一个新的字符串。
 *
 * 返回 所有可能得到的字符串集合 。以 任意顺序 返回输出。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "a1b2"
 * 输出：["a1b2", "a1B2", "A1b2", "A1B2"]
 * 示例 2:
 *
 * 输入: s = "3z4"
 * 输出: ["3z4","3Z4"]
 *  
 *
 * 提示:
 *
 * 1 <= s.length <= 12
 * s 由小写英文字母、大写英文字母和数字组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/letter-case-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P784_2 {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        char[] charArray = s.toCharArray();
        dfs(charArray, 0, res);
        return res;
    }

    /***
     *
     * @param charArray
     * @param deep 深度
     * @param res
     */
    private void dfs(char[] charArray, int deep, List<String> res) {
        // 深度够了
        if (deep == charArray.length){
            res.add(new String(charArray));
            return;
        }

        dfs(charArray, deep+1, res);
        //　处理字母,字母大小写转化其实就是加减32==1<<5，或者说异或32
        if (Character.isLetter(charArray[deep])){
            charArray[deep] ^=1<<5;
            dfs(charArray, deep + 1, res);
        }

    }
}
