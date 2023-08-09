package com.absurd.leetcode;

/***
 * 给定一个非负整数，你至多可以交换一次数字中的任意两位。返回你能得到的最大值。
 *
 * 示例 1 :
 *
 * 输入: 2736
 * 输出: 7236
 * 解释: 交换数字2和数字7。
 * 示例 2 :
 *
 * 输入: 9973
 * 输出: 9973
 * 解释: 不需要交换。
 * 注意:
 *
 * 给定数字的范围是 [0, 108]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-swap
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P670 {
    public int maximumSwap(int num) {
        char[] numArr = String.valueOf(num).toCharArray();
        if (numArr.length<=1){
            return num;
        }
        for (int i = 0;i<numArr.length-1;i++){
            char max = numArr[i];
            int maxIndex = -1;
            for (int j = i+1; j < numArr.length; j++) {
                if (numArr[j] > max){
                    max = numArr[j];
                    maxIndex = j;
                }
            }
            if (max != numArr[i]){
                char swap = numArr[maxIndex];
                numArr[maxIndex] = numArr[i];
                numArr[i] = swap;
                break;
            }
        }
        return Integer.valueOf(new String(numArr));

    }
}
