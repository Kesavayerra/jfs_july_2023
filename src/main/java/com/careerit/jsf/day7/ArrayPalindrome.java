package com.careerit.jsf.day7;

public class ArrayPalindrome {
    public static void main(String[] args) {

        int[] arr1 =new int[] {10,20,30,20,10};
        int[] arr2= new int[arr1.length];

        for (int i=arr1.length-1,j=0;i>=0;i--,j++){
            arr2[j]=arr1[i];
        }

        boolean flag = true;

        for (int i=0;i<arr1.length;i++){
            if (arr1[i] != arr2[i]){
                flag = false;
                break;
            }

        }
        if(flag){
            System.out.println("Given Array is Palindrome");
        } else {
            System.out.println("Given Array is not a Palindrome");
        }





    }
}
