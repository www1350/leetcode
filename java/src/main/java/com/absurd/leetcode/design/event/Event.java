package com.absurd.leetcode.design.event;

import java.io.Serializable;

/**
 * @author absurd
 * @version Event.java, v 0.1 2023年10月07日 15:46 absurd
 */
public class Event implements Serializable {

    private Object payLoad;

    /**
     * Getter method for property <tt>payLoad</tt>.
     *
     * @return property value of payLoad
     */
    public Object getPayLoad() {
        return payLoad;
    }

    /**
     * Setter method for property <tt>payLoad</tt>.
     *
     * @param payLoad value to be assigned to property payLoad
     */
    public void setPayLoad(Object payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "Event{" +
                "payLoad=" + payLoad +
                '}';
    }
}