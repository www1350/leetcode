package com.absurd.leetcode.design.factory;

/**
 * @author absurd
 * @version TeaCategoryEnum.java, v 0.1 2023年10月07日 16:19 absurd
 */
public enum TeaCategoryEnum {
    RED("RED"),

    GREEN("GREEN");
    private String code;

    TeaCategoryEnum(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }
}