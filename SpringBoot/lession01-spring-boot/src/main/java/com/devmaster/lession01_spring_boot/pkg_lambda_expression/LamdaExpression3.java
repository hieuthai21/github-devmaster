package com.devmaster.lession01_spring_boot.pkg_lambda_expression;

@FunctionalInterface
interface Calculator1{
    int add(int a, int b);
}
@FunctionalInterface
interface Calculator2{
    void add(int a, int b);
}
public class LamdaExpression3 {
    public static void main(String[] args) {
        Calculator1 calc1 = (int a, int b) -> {
            System.out.printf("\n %d + %d = %d\n", a,b, a+b);
            return a+b;
        };
        calc1.add(10,20);
        Calculator1 calc2 = (a,b) -> a + b;
        System.out.println(calc2.add(11, 22));
        Calculator2 calc3 = (a,b)-> System.out.println(a+b);
        calc3.add(12,13);
        Calculator1 calc4 = (a,b)->{
            int sum = a+b;
            System.out.println(a+"+"+b+"="+sum);
            return sum;
        };
        calc4.add(15,17);
        Calculator1 calc5 = (a,b)->{
            return a+b;
        };
        System.out.printf("\n %d + %d = %d",10,20,calc5.add(10,20));
    }
}
