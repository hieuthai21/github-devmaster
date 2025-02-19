package com.devmaster.lession01_spring_boot.pkg_lambda_expression;

@FunctionalInterface
interface sayHello2 {
    void sayHello(String name);
}
public class LamdaExpression2 {
    public static void main(String[] args) {
        // Lambda su dung 1 tham so
        sayHello2 say1 = (name) ->{
            System.out.println("Hello " + name);
        };
        say1.sayHello("Hieu Thai");
        //ngan gon
        sayHello2 say2 = name ->{
            System.out.println("Hello " + name);
        };
        say2.sayHello("Hieu Thaiiiiii");
        //ngan gon hon
        sayHello2 say3 = name -> System.out.println("Hello " + name);
        say3.sayHello("Hiu");
    }
}
