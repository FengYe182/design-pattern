package com.fengye.demo;

/**
 * @ClassName Game
 * @Description
 */
public abstract class Game {

    abstract void init();

    abstract void start();

    abstract void end();

    final void play() {
        init();
        start();
        end();
    }
}
