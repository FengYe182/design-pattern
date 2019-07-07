package com.fengye.demo;

/**
 * @ClassName Client
 * @Description
 */
public class Client {

    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    void doTask() {
        businessDelegate.doTask();
    }
}
