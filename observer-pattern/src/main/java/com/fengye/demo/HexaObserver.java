package com.fengye.demo;

/**
 * @ClassName HexaObserver
 * @Description
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
