package com.devmaster.lession01_spring_boot.pkg_method_references;
@FunctionalInterface
interface ExecuteFunction{
    public int execute(int a, int b);
}
class MathUtils {
    public MathUtils() {}
    public MathUtils(String str) {
        System.out.println("MathUtils: " + str);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class DemoMethodref {
    public static int doAction(int a, int b,ExecuteFunction func) {
        return func.execute(a,b);
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        int sum = doAction(a, b, MathUtils::add);
        System.out.println("Add: " + sum);
        int sub = doAction(a,b, MathUtils::subtract);
        System.out.println("Subtract: " + sub);
      //  int mul= doAction(a,b,MathUtils::multiply);
        MathUtils math = new MathUtils();
        int mul=doAction(a,b,math::multiply);
        System.out.println("Multiply: " + mul);
    }

}
