package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/4/27 1:55 下午
 */

public class EmployeeTaxStrategy implements TaxStrategy {

    private static final double NORMAL_RATE = 0.40;
    private static final double MARRIED_FEMALE_RATE = 0.48;

    @Override
    public double extortCash(Employee e) {
//        Employee e  = (Employee) taxPayer;
        if (e.isMarried() &&
                e.getGender() == Employee.Gender.FEMALE) {
            return e.getIncome() * MARRIED_FEMALE_RATE;
        }
        return e.getIncome() * NORMAL_RATE;
    }
}
