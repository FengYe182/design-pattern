package com.fengye.demo;

/**
 * @ClassName ComputerReadDemo
 * @Description
 */
public class ComputerReadDemo {

    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));

        TFCard tfCard = new TFCardImpl();
        SDCard sdCard1 = new SDAdapterTF(tfCard);
        System.out.println(computer.read(sdCard1));
    }
}
