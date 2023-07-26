package com.careerit.jsf.day6;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (true){


                System.out.println("1. Is Prime Number");
                System.out.println("2. Reverse the number");
                System.out.println("3. Check Palindrome number");
                System.out.println("4. Check Sum of Digits");
                System.out.println("5. Exit");
                System.out.println("-" .repeat(100));

                System.out.println("Enter the choice:");
                int choice = sc.nextInt();
                if (choice == 5){
                    System.out.println("Thanks for using the app");
                    break;
                }
                System.out.println("Enter the num");
                int num =sc.nextInt();
                switch (choice){
                    case 1: if(MethodExample.isPrime(num)){
                        System.out.println("Given number "+num+" is Prime number");
                    } else {
                        System.out.println("Given number "+num+" is not Prime number");
                    }
                    break;
                    case 2:
                        System.out.println("Reverse of number "+ num + " is "+MethodExample.reverse(num));
                    break;
                    case 3:
                        if (MethodExample.isPalindrome(num)) {
                            System.out.println("Given number "+num+" is Palindrome number");

                        }else {
                            System.out.println("Given number "+num+" is not Palindrome number");
                        }
                    break;
                    case 4:
                        System.out.println("Sum of digits of "+num+" is "+ MethodExample.sumOfDigits(num));
                    break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("InValid Choice");
                }

            }
    }
}
