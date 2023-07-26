package com.careerit.jsf.day7;

import java.util.Arrays;

public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "cat"; // act, tac, atc, tca, cta are Anagram words
        String str2 = "act";

        if(str1.length() == str2.length()){
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1,arr2)){
                System.out.println("Given words are Anagram");
            }

        }else {
            System.out.println("Given words are not anagram");
        }

    }
}
