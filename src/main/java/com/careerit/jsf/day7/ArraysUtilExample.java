package com.careerit.jsf.day7;

import java.util.Arrays;

public class ArraysUtilExample {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10,20,30,20,10};
        int[] arr2= new int[arr1.length];

        for (int i=arr1.length-1,j=0;i>=0;i--,j++){
            arr2[j]=arr1[i];

        }
        System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.equals(arr1,arr2));


        if (Arrays.equals(arr1,arr2)){
            System.out.println("Given Array is Palindrome");
        }else {
            System.out.println("Given Array is not Palindrome");
        }

        //System.arraycopy(arr1,arr1.length-1,arr2,0,arr1.length);
        //System.out.println(Arrays.toString(arr2));
        // To Sort int arrays
        int[] arr3 = new int[]{1,2,5,4,3};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        // To Sort character arrays
        String[] arr4 = new String[]{"A","B","C","G","E","F","D"};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        //To Convert String to Char array
        String name ="Core Java";
        char[] arr5 = name.toCharArray();
        System.out.println(Arrays.toString(arr5));
        char[] arr6 = {'C','o','r','e',' ','J','a','v','a'};
        if (Arrays.equals(arr5,arr6)){
            System.out.println("Both are equal");
        }else {
            System.out.println("Both are not equal");
        }




    }
}
