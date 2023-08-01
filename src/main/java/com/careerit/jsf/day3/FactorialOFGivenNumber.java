package com.careerit.jsf.day3;

import java.util.Scanner;

public class FactorialOFGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact =1;
        for(int i = num; i>=1;i--)
            fact *=i;
        System.out.println("Factorial of number "+num+" is "+fact);
    }

}
