package com.fengye.demo;

/**
 * @ClassName BusinessDelegate
 * @Description
 */
public class BusinessDelegate {

    private LookUpService lookUp = new LookUpService();
    private BusinessService businessService;
    private String serviceType;


    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    void doTask() {
        businessService = lookUp.doProcessing(serviceType);
        businessService.doProcessing();
    }
}
