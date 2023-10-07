package com.absurd.leetcode.design.factory;

/**
 * @author absurd
 * @version GreenTea.java, v 0.1 2023年10月07日 16:17 absurd
 */
public class GreenTea extends Tea{
    public GreenTea() {
    }

    public GreenTea(TeaPackage teaPackage, TeaFermentation teaFermentation) {
        super(teaPackage, teaFermentation);
    }
}