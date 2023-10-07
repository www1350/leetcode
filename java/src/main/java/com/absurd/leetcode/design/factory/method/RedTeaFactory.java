package com.absurd.leetcode.design.factory.method;

import com.absurd.leetcode.design.factory.RedTea;
import com.absurd.leetcode.design.factory.Tea;

/**
 * @author absurd
 * @version RedTeaFactory.java, v 0.1 2023年10月07日 16:30 absurd
 */
public class RedTeaFactory implements TeaFactory{
    @Override
    public Tea createTea() {
        return new RedTea();
    }
}