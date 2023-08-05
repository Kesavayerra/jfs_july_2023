package com.careerit.jsf.day16;
// Final class cant be inherited
// When constructor is Private there is no way that we can create object to access outside the class
// To access a class from another class we have 2 ways
//- Is a Relationship - Using extend key word or doing inheritance
//- Has a relationship - creating a work object/ owning a work object and using
// We can access final class private constructor by creating a static method
public final class MaskUtil {

    private MaskUtil(){}

    public static String maskAccNumber(String accNumber){
        String lastFour = accNumber.substring(accNumber.length()-4);
        return "XXXXXX"+lastFour;
    }


}
