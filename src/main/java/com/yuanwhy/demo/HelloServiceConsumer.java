package com.yuanwhy.demo;

import com.yuanwhy.service.HelloService;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TEnum;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created by why on 2015/10/26.
 */
public class HelloServiceConsumer {
    public static void main(String[] args) {
        TTransport transport = new TSocket("0.0.0.0", 7911);
        try {
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            HelloService.Client client = new HelloService.Client(protocol);
            System.out.println(client.sayHello("yuanwhy"));
            transport.close();
        } catch (TApplicationException e) {

            if (e.getType() == TApplicationException.MISSING_RESULT) {
                System.out.println("null");
            }

        } catch (TException e){

        }
    }

}
