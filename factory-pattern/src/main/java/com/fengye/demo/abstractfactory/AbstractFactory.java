package com.fengye.demo.abstractfactory;

/**
 * @ClassName AbstractFactory
 * @Description
 */

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
