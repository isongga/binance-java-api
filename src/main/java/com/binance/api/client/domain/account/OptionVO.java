package com.binance.api.client.domain.account;

import java.math.BigDecimal;

/**
 * @author hongjie wang
 * @version 1.0
 * @date 2021/11/24 10:40 上午
 */
public class OptionVO {
    private String currency;// 资产类型
    private BigDecimal equity;// 账户权益
    private BigDecimal available;// 账户可用
    private BigDecimal orderMargin;// 委托保证金
    private BigDecimal positionMargin;// 持仓保证金
    private BigDecimal unrealizedPNL;// 未实现盈亏
    private BigDecimal maintMargin;// 维持保证金
    private BigDecimal balance;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getEquity() {
        return equity;
    }

    public void setEquity(BigDecimal equity) {
        this.equity = equity;
    }

    public BigDecimal getAvailable() {
        return available;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    public BigDecimal getOrderMargin() {
        return orderMargin;
    }

    public void setOrderMargin(BigDecimal orderMargin) {
        this.orderMargin = orderMargin;
    }

    public BigDecimal getPositionMargin() {
        return positionMargin;
    }

    public void setPositionMargin(BigDecimal positionMargin) {
        this.positionMargin = positionMargin;
    }

    public BigDecimal getUnrealizedPNL() {
        return unrealizedPNL;
    }

    public void setUnrealizedPNL(BigDecimal unrealizedPNL) {
        this.unrealizedPNL = unrealizedPNL;
    }

    public BigDecimal getMaintMargin() {
        return maintMargin;
    }

    public void setMaintMargin(BigDecimal maintMargin) {
        this.maintMargin = maintMargin;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
