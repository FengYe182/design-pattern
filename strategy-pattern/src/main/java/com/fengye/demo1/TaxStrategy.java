package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/4/27 1:53 下午
 */
public interface TaxStrategy<P extends TaxPayer> {

     double extortCash(P p);
}
