package com.fengye.demo;

/**
 * @ClassName NullCustomer
 * @Description
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    Boolean isNil() {
        return true;
    }
}
