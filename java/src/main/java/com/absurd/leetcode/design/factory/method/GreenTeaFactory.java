package com.absurd.leetcode.design.factory.method;

import com.absurd.leetcode.design.factory.GreenTea;
import com.absurd.leetcode.design.factory.Tea;

/**
 * @author absurd
 * @version GreenTeaFactory.java, v 0.1 2023年10月07日 16:30 absurd
 */
public class GreenTeaFactory implements TeaFactory{
    @Override
    public Tea createTea() {
        return new GreenTea();
    }
}