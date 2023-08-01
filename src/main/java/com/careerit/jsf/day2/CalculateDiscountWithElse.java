package com.careerit.jsf.day2;

import java.util.Scanner;

public class CalculateDiscountWithElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        double billAmount =sc.nextDouble();

        double discount;

        if(billAmount >= 1000) {
            discount = billAmount * 0.1;
            double netAmount = billAmount - discount;
        }
        else {
            discount = billAmount * 0.05;
            double netAmount = billAmount - discount;
        }
        double netAmount = billAmount - discount;
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("Discount :"+discount);
        System.out.println("Net Amount :"+netAmount);

    }
}
