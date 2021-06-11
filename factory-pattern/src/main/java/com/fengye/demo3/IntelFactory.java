package com.fengye.demo3;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 5:09 下午
 */
public class IntelFactory implements ComputerFactory {


    public Cpu makeCpu() {
        return new IntelCpu();
    }

    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }

    public HardDisk makeHardDisk() {
        return new IntelHardDisk();
    }
}
