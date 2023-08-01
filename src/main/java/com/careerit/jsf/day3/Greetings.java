package com.careerit.jsf.day3;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No of times to print message :");
        int num = sc.nextInt();

        for (int i=1; i<=num; i++){
            System.out.println("Hello World");
        }
    }
}
