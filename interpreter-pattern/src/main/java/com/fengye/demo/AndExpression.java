package com.fengye.demo;

/**
 * @ClassName AndExpression
 * @Description
 */
public class AndExpression implements Expression {

    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expr1 = expression1;
        this.expr2 = expression2;
    }

    @Override

    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);

    }
}
