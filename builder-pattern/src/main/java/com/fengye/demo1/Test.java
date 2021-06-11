package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 7:23 下午
 */
public class Test {

    public static void main(String[] args) {
        User user = User.builder()
                .name("张三")
                .nickName("小张三")
                .password("123456")
                .age(18)
                .build();

        System.out.println(user.toString());

        User2 user2 = User2.builder()
                .name("张三")
                .nickName("小张三")
                .password("123456")
                .age(18)
                .build();

        System.out.println(user2);
    }
}
