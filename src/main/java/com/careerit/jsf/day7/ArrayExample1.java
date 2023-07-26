package com.careerit.jsf.day7;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        arr[3]=13;
        arr[4]=14;

        System.out.println("length of array : "+arr.length);
        System.out.println("Elements of array :"+arr[0]);
        System.out.println("Elements of array :"+arr[2]);
        System.out.println("Elements of array last element : "+arr[arr.length-1]);



        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);

        }

        // Print array in reverse order
        System.out.println("Array Reverse Order");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        for (int ele:arr){
            System.out.println(ele);
        }
    }
}
