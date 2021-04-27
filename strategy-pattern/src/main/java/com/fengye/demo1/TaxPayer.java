package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/4/27 1:51 下午
 */
public abstract class TaxPayer <P extends TaxPayer> {

    public static final TaxStrategy EMPLOYEE = new EmployeeTaxStrategy();
    public static final TaxStrategy COMPANY = new CompanyTaxStrategy();
    public static final TaxStrategy TRUST = new TrustTaxStrategy();

    private double income;
    private TaxStrategy taxStrategy;


    public TaxPayer(TaxStrategy taxStrategy, double income) {

        this.taxStrategy = taxStrategy;
        this.income = income;
    }

    protected abstract P getDetailedType();

    public double getIncome() {
        return income;
    }

    public double extortCash() {
        return taxStrategy.extortCash(getDetailedType());
    }

}
