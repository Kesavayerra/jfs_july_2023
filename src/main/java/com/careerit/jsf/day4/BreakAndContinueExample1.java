package com.careerit.jsf.day4;

public class BreakAndContinueExample1 {

    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if(i % 6 == 0 && i % 15 == 0){
                System.out.println("FizzBuzz");
                if (i % 12 == 0){
                    break;
                }
            }
            System.out.print(i+" ");

        }
    }
}
