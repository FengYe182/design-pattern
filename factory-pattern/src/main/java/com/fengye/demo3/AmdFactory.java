package com.fengye.demo3;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 5:15 下午
 */
public class AmdFactory implements ComputerFactory {


    public Cpu makeCpu() {
        return new AmdCpu();
    }

    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }


    public HardDisk makeHardDisk() {
        return new HardDisk();
    }


}
