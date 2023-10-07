package com.absurd.leetcode.design.factory;

/**
 * @author absurd
 * @version Tea.java, v 0.1 2023年10月07日 16:17 absurd
 */
public class Tea {
    private TeaPackage teaPackage;

    private TeaFermentation teaFermentation;

    public Tea() {
    }

    public Tea(TeaPackage teaPackage, TeaFermentation teaFermentation) {
        this.teaPackage = teaPackage;
        this.teaFermentation = teaFermentation;
    }

    /**
     * Getter method for property <tt>teaFermentation</tt>.
     *
     * @return property value of teaFermentation
     */
    public TeaFermentation getTeaFermentation() {
        return teaFermentation;
    }

    /**
     * Setter method for property <tt>teaFermentation</tt>.
     *
     * @param teaFermentation value to be assigned to property teaFermentation
     */
    public void setTeaFermentation(TeaFermentation teaFermentation) {
        this.teaFermentation = teaFermentation;
    }

    /**
     * Getter method for property <tt>teaPackage</tt>.
     *
     * @return property value of teaPackage
     */
    public TeaPackage getTeaPackage() {
        return teaPackage;
    }

    /**
     * Setter method for property <tt>teaPackage</tt>.
     *
     * @param teaPackage value to be assigned to property teaPackage
     */
    public void setTeaPackage(TeaPackage teaPackage) {
        this.teaPackage = teaPackage;
    }
}