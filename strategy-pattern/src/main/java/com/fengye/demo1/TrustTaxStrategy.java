package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/4/27 1:56 下午
 */
public class TrustTaxStrategy implements TaxStrategy {

    private static final double RATE = 0.40;

    public double extortCash(double income) {
        return income * RATE;
    }

    @Override
    public double extortCash(TaxPayer taxPayer) {
        return 0;
    }
}
