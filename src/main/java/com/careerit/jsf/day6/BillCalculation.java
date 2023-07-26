package com.careerit.jsf.day6;

import java.util.Scanner;

public class BillCalculation {

    //If day is weekday discount is 10% (M,T,W)
    //If day is mid weekday discount is 20% (T,F)
    //if day is weekend 30% extra on bill amount(S,S)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        double billAmount = sc.nextDouble();
        System.out.println("Enter the day number (1-7) : ");
        int day = sc.nextInt();

        double totalBillAmount = 0;
        if (day>=1 && day <=3){
            System.out.println("Week you get 10% discount");
            totalBillAmount = billAmount - (billAmount *0.1);
        } else if (day>=4 && day <=5) {
            System.out.println("Mid Week you get 10% discount");
            totalBillAmount = billAmount -(billAmount*0.2);
        } else if (day>=6 && day <=7){
            System.out.println("Weekend you be charged extra 30% ");
            totalBillAmount = billAmount + (billAmount*0.3);
        } else {
            System.out.println("individual day number");
        }

        System.out.println("Your Bill amount is : "+billAmount);
        System.out.println("Your Total Bill amount is : "+totalBillAmount);

        switch (day){
            case 1,2,3:
                System.out.println("Week you get 10% discount");
                totalBillAmount = billAmount - (billAmount*0.1);
                break;
            case 4,5:
                System.out.println("Mid week you get 20 % discount");
                totalBillAmount = billAmount - (billAmount*0.2);
                break;
            case 6,7:
                System.out.println("Weekend you be charged extra 30% ");
                totalBillAmount = billAmount + (billAmount*0.3);
                break;
            default:
                System.out.println("Enter the valid number");
        }

        System.out.println("Total Bill Amount : "+totalBillAmount);
    }

}
