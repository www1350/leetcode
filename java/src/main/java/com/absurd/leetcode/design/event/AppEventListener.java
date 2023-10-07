package com.absurd.leetcode.design.event;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @author absurd
 * @version AppEventListener.java, v 0.1 2023年10月07日 15:52 absurd
 */
public class AppEventListener implements EventListener{
    private final static Logger LOGGER = LoggerFactory.getLogger(AppEventListener.class);

    @Override
    public void onEvent(Event event) {
        LOGGER.warn(event.toString());
    }
}