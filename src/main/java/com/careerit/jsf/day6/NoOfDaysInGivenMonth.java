package com.careerit.jsf.day6;

import java.util.Scanner;

public class NoOfDaysInGivenMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number : ");
        int num = sc.nextInt();
        int numOfDays = switch (num){
            case 1 -> 31;
            case 2 -> 28 ;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> 0;

        };
        System.out.println("In Month : "+num+" no of days are "+numOfDays);

    }
}
