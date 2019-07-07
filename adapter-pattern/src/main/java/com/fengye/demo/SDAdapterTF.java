package com.fengye.demo;

/**
 * @ClassName SDAdapterTF
 * @Description
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String read() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public int write(String msg) {
        System.out.println("adapter write tf card");
        return tfCard.writeTF(msg);
    }
}
