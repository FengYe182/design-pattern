package com.fengye.demo;

/**
 * @ClassName ComputerPart
 * @Description
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}