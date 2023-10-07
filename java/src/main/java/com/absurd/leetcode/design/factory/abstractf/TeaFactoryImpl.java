package com.absurd.leetcode.design.factory.abstractf;

import com.absurd.leetcode.design.factory.*;

/**
 * @author absurd
 * @version TeaFactoryImpl.java, v 0.1 2023年10月07日 16:47 absurd
 */
public class TeaFactoryImpl implements TeaFactory{
    @Override
    public Tea createGreenTea() {
        TeaFermentation teaFermentation = new TeaFermentation();
        teaFermentation.setType("不发酵");
        TeaPackage teaPackage = new TeaPackage();
        Tea tea = new GreenTea(teaPackage, teaFermentation);
        return tea;
    }

    @Override
    public Tea createRedTea() {
        TeaFermentation teaFermentation = new TeaFermentation();
        teaFermentation.setType("全发酵");
        TeaPackage teaPackage = new TeaPackage();
        Tea tea = new RedTea(teaPackage, teaFermentation);
        return tea;
    }
}