package com.binance.api.client.domain.account;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author hongjie wang
 * @version 1.0
 * @date 2021/11/24 10:45 上午
 */
public class Data {
    private BigDecimal totalAssetOfBtc;
    private List<Balance> balances;

    public BigDecimal getTotalAssetOfBtc() {
        return totalAssetOfBtc;
    }

    public void setTotalAssetOfBtc(BigDecimal totalAssetOfBtc) {
        this.totalAssetOfBtc = totalAssetOfBtc;
    }

    public List<Balance> getBalances() {
        return balances;
    }

    public void setBalances(List<Balance> balances) {
        this.balances = balances;
    }
}
