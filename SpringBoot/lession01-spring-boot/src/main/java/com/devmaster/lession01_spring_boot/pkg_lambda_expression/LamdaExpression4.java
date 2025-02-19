package com.devmaster.lession01_spring_boot.pkg_lambda_expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaExpression4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java SpringBoot", "JavaScript", "Python", "C# NetCore", "PHP");
        list.forEach(x->System.out.println(x));
        System.out.println("========================");
        list.forEach(System.out::println);
        //filter
        System.out.println("========================");
        list.stream().filter(x->x.contains("Java")).forEach(System.out::println);
        System.out.println("========================");
        list.stream().filter(x->x.length()>10).forEach(System.out::println);
        }
    }

