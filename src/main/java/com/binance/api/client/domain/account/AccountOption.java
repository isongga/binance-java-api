package com.binance.api.client.domain.account;

import java.util.List;

/**
 * @author hongjie wang
 * @version 1.0
 * @date 2021/11/24 10:40 上午
 */
public class AccountOption {
    private List<OptionVO> data;

    public List<OptionVO> getData() {
        return data;
    }

    public void setData(List<OptionVO> data) {
        this.data = data;
    }
}
