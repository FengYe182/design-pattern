package com.fengye.demo.abstractfactory;

/**
 * @ClassName FactoryProducer
 * @Description
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            System.out.println("创建SHAPE工厂！");
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            System.out.println("创建COLOR工厂！");
            return new ColorFactory();
        }
        return null;
    }

}
