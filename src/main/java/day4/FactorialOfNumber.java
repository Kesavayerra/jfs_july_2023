package day4;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int i = sc.nextInt();
       // int i = number;
        int res = 1;
   //     for (int i =number; i>=2; i--) {
        //        res *= i;
   //     }

        while(i>=2){

            res *= i;
             i--;
        }
        System.out.println("Factorial of "+i+" is "+res);
    }
}
