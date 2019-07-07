package com.fengye.demo;

/**
 * @ClassName LookUpService
 * @Description
 */
public class LookUpService {

    public BusinessService doProcessing(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
