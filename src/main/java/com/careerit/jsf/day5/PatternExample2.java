package com.careerit.jsf.day5;

import java.util.Scanner;

/*
9 18 27
36 45 54
63 72 81
 */
public class PatternExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for (int i=1; i<=3; i++){
            for (int j=1;j<=3;j++){
                System.out.print(num+" ");
                num +=9;
            }
            System.out.println();
        }

    }


}
