package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/4/27 1:51 下午
 */
public class TaxPayer2 {

    public static final int COMPANY = 0;
    public static final int EMPLOYEE = 1;
    public static final int TRUST = 2;
    private static final double COMPANY_RATE = 0.30;
    private static final double EMPLOYEE_RATE = 0.45;
    private static final double TRUST_RATE = 0.35;

    private double income;
    private final int type;

    public TaxPayer2(int type, double income) {
        this.type = type;
        this.income = income;
    }


    public double getIncome() {
        return income;
    }


    public double extortCash() {
        switch (type) {
            case COMPANY:
                return income * COMPANY_RATE;
            case EMPLOYEE:
                return income * EMPLOYEE_RATE;
            case TRUST:
                return income * TRUST_RATE;
            default:
                throw new IllegalArgumentException();
        }
    }
}
