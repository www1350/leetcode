package com.absurd.leetcode;

public class P9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int[] nums = new int[11];

        int i = 0;
        while (x > 0) {
            nums[i++] = x % 10;
            x /= 10;
        }
        for (int j = 0; j <= i / 2; j++) {
            if (nums[j] != nums[i - j - 1]) {
                return false;
            }
        }
        return true;

    }
}
