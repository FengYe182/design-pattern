package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 8:21 下午
 */
public class Noodle implements Food {
    @Override
    public String setSalt(String salt) {
        return salt;
    }

    @Override
    public String addCondiment(String pepper) {
        return null;
    }


    public String setNoodle(String noodle) {
        return noodle;
    }
}
