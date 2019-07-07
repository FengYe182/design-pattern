package com.fengye.demo;

/**
 * @ClassName Originator
 * @Description
 */
public class Originator {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento saveStateToMemento() {
        return new Memento(state);
    }

    void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }


}
