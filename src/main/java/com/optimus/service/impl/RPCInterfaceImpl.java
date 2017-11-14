package com.optimus.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.optimus.model.ResultInfo;
import com.optimus.service.RPCInterface;

/**
 * Created by Dongchuang on 2017/11/14.
 */
@Service(version = "1.0.0")
public class RPCInterfaceImpl implements RPCInterface {

    @Override
    public ResultInfo getRPCInfo() {
        ResultInfo resultInfo=new ResultInfo("我是RPC的返回信息，来自其它系统的实现方法");
        return resultInfo;
    }
}
