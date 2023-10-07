package com.absurd.leetcode.design.singleton;

/**
 * @author absurd
 * @version InnerSingleton.java, v 0.1 2023年10月07日 17:34 absurd
 */
public class InnerSingleton {
    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }
    private InnerSingleton (){}

    /***
     * 失去资源加载优势，类加载过程的初始化阶段
     * @return
     */
    public static final InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}