package com.careerit.jsf.day3;

import java.util.Scanner;

public class SumOfFirstEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int sum =0 ;
        for(int i=1; i<=num; i++){
            sum +=i;
            if(i % 2==0){
                evensum +=i;
            }else{
                oddsum +=i;
            }
        }
        System.out.println("Sum of first "+num+" numbers is "+sum);
        System.out.println("Sum of first "+num+" even numbers is "+evensum);
        System.out.println("Sum of first "+num+" odd numbers is "+oddsum);
    }
}
