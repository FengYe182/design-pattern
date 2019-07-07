package com.fengye.demo;

/**
 * @ClassName NameIterator
 * @Description
 */
public class NameIterator implements Iterator {

    String[] args;
    int index = 0;

    public NameIterator(String[] argsTemp) {
        this.args = argsTemp;
    }

    @Override
    public boolean hasNext() {
        if (index < args.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return args[index++];
        }
        return null;
    }
}
