package com.careerit.jsf.day1;

public class OperatorExample {
    public static void main(String[] args) {
        int num1 = 165;
        int num2 =16;
        System.out.println("Addition of "+num1 + " and " + num2+ " is "+(num1+num2));
        System.out.println("Subtraction of "+num1 + " and " + num2+ " is "+(num1-num2));
        System.out.println("Multiplication of "+num1 + " and " + num2+ " is "+(num1*num2));
        System.out.println("Division of "+num1 + " and " + num2+ " is "+(num1/num2));
        System.out.println("Division of "+num1 + " and " + num2+ " is "+(num1%num2));

        int m=5;
        int n=3;
        double res=Math.pow(m,n);
        System.out.println(m+" to the power of "+n+" is "+res);
    }
}
