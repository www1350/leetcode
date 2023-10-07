package com.absurd.leetcode.design.event;


/**
 * @author absurd
 * @version AppEventPublisher.java, v 0.1 2023年10月07日 15:52 absurd
 */
public class AppEventPublisher extends AbstractEventPublisher{


    @Override
    public void publishEvent(Event event) {
        for(EventListener eventListener : eventListenerList){
            eventListener.onEvent(event);
        }
    }
}