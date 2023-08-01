package com.careerit.jsf.day3;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Buying Price : ");
        int BuyingPrice= sc.nextInt();
        System.out.println("Enter the Selling Price : ");
        int SellingPrice = sc.nextInt();
        if (BuyingPrice<SellingPrice){
           double Profit = SellingPrice-BuyingPrice;
            System.out.println("Profit on Product is " +Profit);
        } else if (BuyingPrice>SellingPrice) {
            double Loss = BuyingPrice-SellingPrice;
            System.out.println("Loss on Product is " +Loss);
        } else {
            System.out.println("No Profit No Loss");
        }


    }
}
