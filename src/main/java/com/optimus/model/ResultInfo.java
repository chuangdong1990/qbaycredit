package com.optimus.model;

import java.io.Serializable;

/**
 * Created by Dongchuang on 2017/11/14.
 */
public class ResultInfo implements Serializable {
    private static final long serialVersionUID = -1L;
    private String resultInfo;

    public ResultInfo(String resultInfo) {
        super();
        this.resultInfo = resultInfo;
    }

    public ResultInfo() {
        super();
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    };
}
