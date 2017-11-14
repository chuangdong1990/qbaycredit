package com.optimus.service;

import com.optimus.model.ResultInfo;

/**
 * Created by Dongchuang on 2017/11/14.
 */
public interface RPCInterface {
    /**
     * 通过Dubbo实现远程RPC调用接口信息
     * @return
     */
    public ResultInfo getRPCInfo();
}
