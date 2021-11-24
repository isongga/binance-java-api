package com.binance.api.client.domain.account;

/**
 * @author hongjie wang
 * @version 1.0
 * @date 2021/11/24 10:46 上午
 */
public class Balance {
    private String asset;
    private String free;
    private String locked;

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }
}
