package com.careerit.jsf.day13;
import static java.lang.Math.*;
public class StaticExample {
// Static method means method can be called without creating a object using class
    public static void main(String[] args) {
        // sqrt 9, m power n, ceil, floor
            System.out.println(round(9.8));
            System.out.println(sqrt(9));
            System.out.println(pow(9,2));
            System.out.println((9.8));
            System.out.println(floor(9.8));
            System.out.println(round(9.5));
            System.out.println(round(9.449));

        int num1=10, num2 =20, num3=30;
        NumberExample obj = new NumberExample();
        System.out.println("Maximum of "+num1+", "+num2+" & "+num3+" is "+obj.max(num1,num2,num3));
        // so here we are creating object and calling the method instead of that if we declare our method as static we
        // we can directly access method

        System.out.println("Maximum of "+num1+", "+num2+" & "+num3+" is "+NumberExample.max(num1,num2,num3));


    }
}
