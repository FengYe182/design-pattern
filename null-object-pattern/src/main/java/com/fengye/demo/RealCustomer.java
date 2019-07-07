package com.fengye.demo;

/**
 * @ClassName RealCustomer
 * @Description
 */
public class RealCustomer extends  AbstractCustomer {

    String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    Boolean isNil() {
        return false;
    }
}
