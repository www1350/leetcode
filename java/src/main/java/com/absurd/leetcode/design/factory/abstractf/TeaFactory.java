package com.absurd.leetcode.design.factory.abstractf;

import com.absurd.leetcode.design.factory.Tea;

/**
 * @author absurd
 * @version TeaFactory.java, v 0.1 2023年10月07日 16:41 absurd
 */
public interface TeaFactory {
    Tea createGreenTea();

    Tea createRedTea();
}