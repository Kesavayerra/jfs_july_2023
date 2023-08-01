package com.careerit.jsf.day11;

public class StringExample5 {

    public static void main(String[] args) {
        String str = "malayalam";
        boolean flag = true;
        for(int i =0, j=str.length()-1;i<j;i++,j--){
            if (str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not Palindrome");
        }
    }
}
