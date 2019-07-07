package com.fengye.demo;

/**
 * @ClassName JMSService
 * @Description
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
