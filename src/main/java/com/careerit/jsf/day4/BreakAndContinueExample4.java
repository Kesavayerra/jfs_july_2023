package com.careerit.jsf.day4;

public class BreakAndContinueExample4 {
    public static void main(String[] args) {
        for (int i = 1; i <=20; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
