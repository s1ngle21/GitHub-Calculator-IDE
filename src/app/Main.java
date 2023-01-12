package app;

public class Main {
    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        intVar();
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int h = subtract(a, b);
        System.out.println(h);
        int j = divide(a, b);
        System.out.println(j);
    }

    private static void intVar() {
         a = 8;
         b = 2;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
