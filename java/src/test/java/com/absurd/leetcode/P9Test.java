package com.absurd.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P9Test {


    @Test
    public void isPalindrome(){
        assert P9.isPalindrome(121) == true;
        assert P9.isPalindrome(0) == true;
        assert P9.isPalindrome(-121) == false;
        assert P9.isPalindrome(122222321) == false;
        assert P9.isPalindrome(Integer.MAX_VALUE) == false;
    }
}
