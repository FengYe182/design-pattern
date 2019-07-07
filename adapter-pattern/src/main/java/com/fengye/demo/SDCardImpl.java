package com.fengye.demo;

/**
 * @ClassName SDCardImpl
 * @Description
 */
public class SDCardImpl implements SDCard {
    @Override
    public String read() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }

    @Override
    public int write(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
