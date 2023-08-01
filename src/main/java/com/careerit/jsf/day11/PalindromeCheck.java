package com.careerit.jsf.day11;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "abcba";
        // String Buffer object cant be assigned to string so we need to convert to string
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)){
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not a Palindrome");
        }

    }
}
