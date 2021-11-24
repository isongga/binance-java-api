package com.binance.api.client.domain.account;

import java.math.BigDecimal;

/**
 * @author hongjie wang
 * @version 1.0
 * @date 2021/11/24 10:45 上午
 */
public class Data {
    private BigDecimal totalAssetOfBtc;

    public BigDecimal getTotalAssetOfBtc() {
        return totalAssetOfBtc;
    }

    public void setTotalAssetOfBtc(BigDecimal totalAssetOfBtc) {
        this.totalAssetOfBtc = totalAssetOfBtc;
    }
}
