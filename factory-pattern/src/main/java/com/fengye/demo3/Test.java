package com.fengye.demo3;


/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 5:16 下午
 */
public class Test {


    public static void main(String[] args) {


        ComputerFactory cf = new AmdFactory();
        // 从这个大厂造 CPU
        Cpu cpu = cf.makeCpu();
        // 从这个大厂造主板
        MainBoard board = cf.makeMainBoard();
        // 从这个大厂造硬盘
        HardDisk hardDisk = ((AmdFactory) cf).makeHardDisk();

        // 将同一个厂子出来的 CPU、主板、硬盘组装在一起
        Computer result = new Computer(cpu, board, hardDisk);

    }


}
