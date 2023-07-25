package com.careerit.jsf.day5;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int num1= num;
        int rev=0;
        while (num1 !=0){
            int r = num1%10;
            rev = rev*10+r;
            num1/=10;
        }

        System.out.println("Reverse of the "+num+" is "+rev);

        if(num == rev){
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }


    }
}
