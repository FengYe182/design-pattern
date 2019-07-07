package com.fengye.demo;

/**
 * @ClassName NamesRepository
 * @Description
 */
public class NameRepository implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }

}
