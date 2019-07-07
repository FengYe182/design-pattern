package com.fengye.demo;

/**
 * @ClassName ThinkpadComputer
 * @Description
 */
public class ThinkpadComputer implements Computer {
    @Override
    public String read(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.read();
    }
}
