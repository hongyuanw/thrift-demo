package com.yuanwhy.service;

import org.apache.thrift.TException;

/**
 * Created by why on 2015/10/26.
 */
public class HelloServiceImpl implements HelloService.Iface {

    @Override
    public String sayHello(String name) throws TException {
        return "Hello, " + name + "!";
    }
}