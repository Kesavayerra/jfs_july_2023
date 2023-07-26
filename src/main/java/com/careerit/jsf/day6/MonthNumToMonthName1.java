package com.careerit.jsf.day6;

import java.util.Scanner;

public class MonthNumToMonthName1 {
    // Using Switch Expression
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number : ");
        int num = sc.nextInt();
        String monthName = switch (num) {
            // if want to write multiple statements we can us yield
            case 1 ->{
                System.out.println("Wish you a happy new year");
                yield "January";}
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Enter Valid Number";

        };
        System.out.println("Month number : "+num+" month name is "+monthName);
    }
}
