package com.careerit.jsf.day1;

import java.util.Scanner;

public class EMICalaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");
        Double amount= scanner.nextDouble();
        System.out.println("Enter the months:");
        int months= scanner.nextInt();
        System.out.println("Enter the rate of interest (%):");
        double rateOfInterest=scanner.nextDouble();

        /*r= r/ (12 * 100);//One Month Interest;*/

        double r= rateOfInterest/12/100;
        double emi = amount * r * Math.pow(1 + r,months) / (Math.pow(1+r, months) -1);
        double totalAmount=emi*months;
        double interestAmount= totalAmount - amount;
        System.out.println("Amount : "+amount);
        System.out.println("Months : "   +months);
        System.out.println("EMI : " + emi);
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Interest Amount : " + interestAmount);






    }
}
