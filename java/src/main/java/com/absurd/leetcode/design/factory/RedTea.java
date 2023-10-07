package com.absurd.leetcode.design.factory;

/**
 * @author absurd
 * @version RedTea.java, v 0.1 2023年10月07日 16:17 absurd
 */
public class RedTea extends Tea{
    public RedTea() {
    }

    public RedTea(TeaPackage teaPackage, TeaFermentation teaFermentation) {
        super(teaPackage, teaFermentation);
    }
}