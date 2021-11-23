package com.binance.api.client.domain.subaccount;

import java.util.List;


public class SpotSummary {
    private Integer totalCount;
    private String masterAccountTotalAsset;
    private List<SpotSubUserAssetBtcVo> spotSubUserAssetBtcVoList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getMasterAccountTotalAsset() {
        return masterAccountTotalAsset;
    }

    public void setMasterAccountTotalAsset(String masterAccountTotalAsset) {
        this.masterAccountTotalAsset = masterAccountTotalAsset;
    }

    public List<SpotSubUserAssetBtcVo> getSpotSubUserAssetBtcVoList() {
        return spotSubUserAssetBtcVoList;
    }

    public void setSpotSubUserAssetBtcVoList(List<SpotSubUserAssetBtcVo> spotSubUserAssetBtcVoList) {
        this.spotSubUserAssetBtcVoList = spotSubUserAssetBtcVoList;
    }
}