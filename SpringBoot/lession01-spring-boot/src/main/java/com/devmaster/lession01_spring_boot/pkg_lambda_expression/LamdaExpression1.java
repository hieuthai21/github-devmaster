package com.devmaster.lession01_spring_boot.pkg_lambda_expression;

@FunctionalInterface
interface sayHello {
    void sayHello();
}

/**Lambda expression ko tham so*/
public class LamdaExpression1 {
    public static void main(String[] args) {
        sayHello sayHello = () ->{
            System.out.println("Hello World");
        };
        sayHello.sayHello();
    }
}
