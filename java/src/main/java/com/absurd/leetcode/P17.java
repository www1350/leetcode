package com.absurd.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P17 {
    /***
     * Given a digit string, return all possible letter combinations that the number could represent.

     A mapping of digit to letters (just like on the telephone buttons) is given below.

     https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png

     Input:Digit string "23"
     Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0){
            return result;
        }
        String[] chars = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int size = digits.length();
        String[] digArr = new String[size];
        for(int i=0;i<size;i++){
            String tmp = chars[digits.charAt(i) - '0'];
            digArr[i] = tmp;
        }
        char[] stack = new char[digits.length()];
        backStack(digArr, stack, 0, result);
        return result;


    }

    private void backStack(String[] digArr, char[] stack, int stackIndex,List<String> result) {
        if (stackIndex == digArr.length){
            result.add(new String(stack));
            return;
        }
        for(int i=0;i<digArr[stackIndex].length();i++){
            stack[stackIndex] = digArr[stackIndex].charAt(i);
            stackIndex++;
            backStack(digArr, stack, stackIndex, result);
            stackIndex--;
        }

    }
}
