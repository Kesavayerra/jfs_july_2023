package com.careerit.jsf.day5;

import java.util.Scanner;

public class ReverseNumbersNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int num1 = num;
        int sum=num;
        while (num1 >9 ){
            sum = 0;
            while (num1!=0){
                int r = num1 % 10;
                sum = sum +r;
                num1 /=10;
            }
            num1 = sum;
        }
        System.out.println("Sum of "+num+" is "+sum);


    }
}

// Q: what is amstrong number?

