package com.devmaster.lesson02.IoC;

class IoCService{
    public void service(){
        System.out.println("service is called");
    }
}
class IoCClient{
    private IoCService iocservice;
    public IoCClient(IoCService service) {
        this.iocservice = service;
    }
    public void doSomething(){
        iocservice.service();
    }
}
public class IocDI {
    public static void main(String[] args) {
        IoCService service = new IoCService();
        IoCClient client = new IoCClient(service);
        client.doSomething();
    }
}
