package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/4/27 2:12 下午
 */
public class Employee extends TaxPayer {


    public enum Gender {MALE, FEMALE}

    private final boolean married;
    private final Gender gender;

    public Employee(TaxStrategy strategy, double income, boolean married, Gender gender) {
        super(strategy, income);
        this.married = married;
        this.gender = gender;
    }

    protected Employee getDetailedType() {
        return this;
    }

    public boolean isMarried() {
        return married;
    }

    public Gender getGender() {
        return gender;
    }

}
