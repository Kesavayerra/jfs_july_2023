package com.careerit.jsf.day5;

import java.util.Scanner;

public class SumOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int num1 = num;
        int sum=num;
        while(sum >9){

            sum = num %10+num/10;
            num = sum;


        }
        System.out.println("Sum of "+num1+" is "+sum);


    }
}
