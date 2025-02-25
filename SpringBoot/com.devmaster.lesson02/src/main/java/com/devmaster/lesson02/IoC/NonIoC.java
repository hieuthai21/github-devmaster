package com.devmaster.lesson02.IoC;

class Service {
    public void service(){
        System.out.println("service is successful");
    }
}

class Client {
    private Service service;
    public Client(){
        service = new Service();
    }
    public void doSomething(){
        service.service();
    }
}
public class NonIoC {
    public static void main(String[] args) {
        Client client = new Client();
        client.doSomething();
    }
}
