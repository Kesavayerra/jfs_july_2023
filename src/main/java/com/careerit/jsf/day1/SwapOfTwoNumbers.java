package com.careerit.jsf.day1;

public class SwapOfTwoNumbers {

    public static void main(String[] args) {
        int num1 = 30;
        int num2 =50;
        System.out.println("Before Swap a = " + num1+" b = "+ num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swap a = " + num1+" b = "+ num2);
    }
}
