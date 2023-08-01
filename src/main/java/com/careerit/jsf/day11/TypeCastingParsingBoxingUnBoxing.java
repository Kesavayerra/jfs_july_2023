package com.careerit.jsf.day11;

public class TypeCastingParsingBoxingUnBoxing {
    public static void main(String[] args) {
        float price = 99.98f;
        int num = (int) price;
        System.out.println(num);

        int a= 10;
        float b = a; //Implicit Type Casting

        float c = 11.89f;

        int d = (int) c; // Explicit Type Casting

        // Parsing

        String str = "100";
        int num2 = Integer.parseInt(str);

        String str1 = "100.5";
        float num1 = Float.parseFloat(str1);


        // Boxing and Unboxing
        Integer ele =100; // Boxing
        //int num2 = ele; // Unboxing

    }
}
