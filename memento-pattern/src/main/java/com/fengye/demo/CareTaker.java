package com.fengye.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CareTaker
 * @Description
 */
public class CareTaker {

    List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
