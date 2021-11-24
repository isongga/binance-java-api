package com.binance.api.client.domain.account;

/**
 * @author hongjie wang
 * @version 1.0
 * @date 2021/11/24 10:43 上午
 */
public class SnapshotVo {
    private Data data;
    private String type;
    private Long updateTime;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
