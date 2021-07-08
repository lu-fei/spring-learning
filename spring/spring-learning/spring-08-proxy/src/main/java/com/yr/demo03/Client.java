package com.yr.demo03;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序来处理我们要调用的接口的对象
        pih.setRent(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}