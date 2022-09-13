package com.absurd.leetcode;

import java.util.HashMap;
import java.util.Map;

/***
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
 *
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s1 = "ab" s2 = "eidbaooo"
 * 输出：true
 * 解释：s2 包含 s1 的排列之一 ("ba").
 * 示例 2：
 *
 * 输入：s1= "ab" s2 = "eidboaoo"
 * 输出：false
 *  
 *
 * 提示：
 *
 * 1 <= s1.length, s2.length <= 104
 * s1 和 s2 仅包含小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/permutation-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        Map<Character,Integer> setA = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            setA.put(s1.charAt(i),setA.getOrDefault(s1.charAt(i), 0)+1);
        }
        Map<Character,Integer> setB = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            setB.put(s2.charAt(i),setB.getOrDefault(s2.charAt(i), 0)+1);
        }
        int index = s1.length();
        while(index < s2.length()){
            if(setA.equals(setB)) {
                return true;
            }

            char before = s2.charAt(index - s1.length());
            char after  = s2.charAt(index);

            setB.put(before, setB.get(before) - 1);
            if(setB.get(before) == 0) {
                setB.remove(before);
            }
            setB.put(after, setB.getOrDefault(after, 0) + 1);

            index++;
        }

        return setB.equals(setA);

    }




}
