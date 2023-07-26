package com.careerit.jsf.day6;

import java.util.Scanner;

public class NoOfDaysInGivenMonthAndYear {

    public static void main(String[] args) {
        // What is leap year?
        // if year is divisible by 4 and not divisible by 100 or Divisible by 400 then it is leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number (1-12) :");
        int month =sc.nextInt();
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        int noofdays = 0;

        switch (month){
            case 1,3,5,7,8,10,12:
                noofdays = 31;
                break;
            case 4,6,9,11:
                noofdays = 30;
                break;
            case 2:
                if ((year%4 == 0 && year%100 !=0)|| year % 400 == 0 ){
                    noofdays = 29;
                }else {
                    noofdays =28;
                }
                break;
            default:
                    noofdays = -1;
                System.out.println("Invalid month number");

            }
            if(noofdays >0){
                System.out.println("No of days in the month "+numToMonth(month)+ " for year "+year+ " is "+noofdays+" days.");
            }else {
                System.out.println("Enter valid month");
            }

        }

        public static String numToMonth(int month){
            return switch (month){
                case 1 ->"January";
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

        }



    }

