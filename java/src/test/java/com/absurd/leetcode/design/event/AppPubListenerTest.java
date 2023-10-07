package com.absurd.leetcode.design.event;

import org.junit.Test;

/**
 * @author absurd
 * @version AppPubListenerTest.java, v 0.1 2023年10月07日 15:54 absurd
 */
public class AppPubListenerTest {
    @Test
    public void test(){
        Event event = new Event();
        event.setPayLoad("222");
        AppEventPublisher publisher = new AppEventPublisher();
        publisher.register(new AppEventListener());
        publisher.publishEvent(event);
    }
}