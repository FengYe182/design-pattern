package com.fengye.demo3;

/**
 * @author WRF
 * @Descirption 抽象电脑工厂
 * @date 2021/6/10 5:06 下午
 */
public interface ComputerFactory {

    Cpu makeCpu();

    MainBoard makeMainBoard();
}
