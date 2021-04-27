package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/4/27 1:54 下午
 */
public class CompanyTaxStrategy implements TaxStrategy {

    private static final double BIG_COMPANY_RATE = 0.30;
    private static final double SMALL_COMPANY_RATE = 0.15;

//    public double extortCash(Company company) {
//        if (company.getNumberOfEmployees() > 5
//                && company.getIncome() < 1000000) {
//            return company.getIncome() * SMALL_COMPANY_RATE;
//        }
//        return company.getIncome() * BIG_COMPANY_RATE;
//    }

    @Override
    public double extortCash(TaxPayer taxPayer) {
        return 0;
    }
}
