package com.absurd.leetcode.design.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author absurd
 * @version AbstractEventPublisher.java, v 0.1 2023年10月07日 16:06 absurd
 */
public abstract class AbstractEventPublisher implements EventPublisher{
    protected List<EventListener> eventListenerList = new ArrayList<>();

    public void register(EventListener eventListener){
        eventListenerList.add(eventListener);
    }

}