package com.fengye.demo.abstractfactory;

/**
 * @ClassName AbstractFactoryPatternDemo
 * @Description
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory abstractFactory =  FactoryProducer.getFactory("SHAPE");
        Shape shape1= abstractFactory.getShape("CIRCLE");
        shape1.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");
        //调用 Red 的 fill 方法
        color1.fill();


    }
}
