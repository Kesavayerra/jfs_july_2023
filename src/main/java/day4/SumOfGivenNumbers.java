package day4;

import java.util.Scanner;

public class SumOfGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int number = num;
        int sum = 0;
        while (number !=0){
            int r=number%10;
            sum += r;
            number = number/10;
        }

        System.out.println("Sum of "+num+" is "+sum);
    }
}
