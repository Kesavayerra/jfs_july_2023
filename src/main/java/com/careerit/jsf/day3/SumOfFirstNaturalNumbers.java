package com.careerit.jsf.day3;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i =1; i<= num; i++){
            sum += i;

        }
        System.out.println("Sum of first "+num+"natural number is "+sum);
    }
}
