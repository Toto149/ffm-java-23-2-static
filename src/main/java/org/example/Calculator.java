package org.example;

public class Calculator {

    private Calculator(){

    }
    public static int add(int a, int b){
        return a+b;
    }

    public static int substract(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        if(b==0){
            System.out.println("Man kann nicht durch 0 teilen");
            return 0;
        }
        return a/b;
    }
}
