package com.careerit.jsf.day7;

import java.util.Arrays;

public class SearchExample {

    public static void main(String[] args) {
        int[] arr = getRandomArray(20);
        int key =10;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, key);
        if(index !=-1){
            System.out.println("Given key "+key+" is not found in the array");
        }else {
            System.out.println("Given key "+key+"is found at index "+index);
        }

    }

    private static int[] getRandomArray(int num) {
        int[] arr = new int[num];
        for (int i =0; i<num;i++){
            arr[i] = (int)(Math.random()*50);
        }
        return arr;
    }
}
