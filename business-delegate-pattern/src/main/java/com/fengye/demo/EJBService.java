package com.fengye.demo;

/**
 * @ClassName EJBService
 * @Description
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
