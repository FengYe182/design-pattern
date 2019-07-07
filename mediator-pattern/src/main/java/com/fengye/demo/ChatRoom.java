package com.fengye.demo;

import java.util.Date;

/**
 * @ClassName ChatRoom
 * @Description
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {

        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }

}
