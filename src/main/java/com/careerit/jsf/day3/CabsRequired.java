package com.careerit.jsf.day3;

import java.util.Scanner;

public class CabsRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of persons : ");
        int persons = sc.nextInt();
        System.out.println("Enter the cab capacity : ");
        int cabCapacity = sc.nextInt();
        int noOfCabs=0;
        if (persons % cabCapacity == 0){
            noOfCabs = persons/cabCapacity;
        }
        else {
            noOfCabs = persons/cabCapacity+1;
        }
        System.out.println("For "+ persons+" persons "+ noOfCabs+ " cabs required");


    }
}
