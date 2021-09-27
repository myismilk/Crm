package com.wangkaiping.crm.utils;

public class ServiceFatory {
    public Object getService(Object service){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(service);
        return myInvocationHandler.getProxy();
    }
}
