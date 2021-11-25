package com.binance.api.client.domain.account;

import java.util.List;

/**
 * @author hongjie wang
 * @version 1.0
 * @date 2021/11/24 10:40 上午
 */
public class AccountSnapshot {
    private Integer code;
    private String msg;
    private List<SnapshotVo> snapshotVos;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<SnapshotVo> getSnapshotVos() {
        return snapshotVos;
    }

    public void setSnapshotVos(List<SnapshotVo> snapshotVos) {
        this.snapshotVos = snapshotVos;
    }
}
