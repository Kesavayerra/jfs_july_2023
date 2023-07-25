package com.careerit.jsf.day5;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int num1 = num;

        int sum=0;
        while (num1 != 0){
            int r = num1%10;
            sum = sum+r*r*r;
            num1 /=10;
        }
        if(num==sum){
            System.out.println("Entered "+num+ " is Amstrong Number");
        }else{
            System.out.println("Entered "+num+ " is not a Amstrong Number");
        }
    }
}
