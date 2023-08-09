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
public class P784 {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        int totalAl = 0;
        StringBuilder noAlSb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) <='Z' && s.charAt(i) >='A'
                    || s.charAt(i) <='z' && s.charAt(i) >='a'){
                totalAl++;
            }else{
                noAlSb.append(s.charAt(i)+"");
            }
        }
        if(totalAl == 0){
            res.add(noAlSb.toString());
            return res;
        }
        // 000000
        // 000001
        // 000010
        // ....
        // a1b2 --> 00 01 10 11--> ab aB Ab AB
        // 每个位置2种情况，所有有字母2的字母个数次方
        int length = (1<< totalAl);
        for(int i=0;i<length;i++){
            int tmpi = 0;
            StringBuilder stringBuilder = new StringBuilder();
            for(int j=0;j<s.length();j++){
                String tmpStr = s.charAt(j)+"";
                if (s.charAt(j) <='Z' && s.charAt(j) >='A'
                        || s.charAt(j) <='z' && s.charAt(j) >='a'){
                    // 是否大写
                    boolean isBig = (i &  (1 <<tmpi)) > 0 ? true : false;
                    tmpStr = isBig ? tmpStr.toUpperCase(): tmpStr.toLowerCase();
                    tmpi++;
                }
                stringBuilder.append(tmpStr);
            }
            res.add(stringBuilder.toString());
        }

        return res;
    }
}
