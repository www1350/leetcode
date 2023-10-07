package com.absurd.leetcode.design.event;

/**
 * @author absurd
 * @version EventPublisher.java, v 0.1 2023年10月07日 15:51 absurd
 */
public interface EventPublisher {
    /***
     *
     * @param event
     */
    void publishEvent(Event event);
}