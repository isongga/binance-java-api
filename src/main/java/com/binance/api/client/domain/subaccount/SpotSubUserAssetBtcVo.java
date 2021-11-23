package com.binance.api.client.domain.subaccount;

public class SpotSubUserAssetBtcVo {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTotalAsset() {
        return totalAsset;
    }

    public void setTotalAsset(String totalAsset) {
        this.totalAsset = totalAsset;
    }

    private String totalAsset;
}