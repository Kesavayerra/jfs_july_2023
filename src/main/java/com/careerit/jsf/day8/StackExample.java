package com.careerit.jsf.day8;

import java.util.Arrays;

class ArrayCRUDExample{
    private int[] arr;

    private int count;

    public ArrayCRUDExample(){
        arr = new int[4];
    }
    public void add(int ele){
        if (count == arr.length) {
            int[] temp = new int[arr.length + 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
            arr[count++]=ele;
            System.out.println("Array :" +Arrays.toString(arr));

    }

    public void delete(int index){
        if (index <0 || index >= count){
            System.out.println("Given index "+index+" is invalid");
        } else {
            for (int i = index; i <count-1;i++){
                arr[i] = arr[i+1];
            }
            count--;

        }
    }
    public void set(int index, int value){
        if (index<0 || index >= count){
            System.out.println("Given index "+index+" is invalid");
        } else {
            arr[index] = value;
        }
    }

    public int get(int index){
        if(index < 0 || index >= count){
            System.out.println("Given index "+index+" is invalid");
            return -1;
        } else {
            return arr[index];
        }
    }

    public int search(int ele){
        for (int i=0; i<count;i++){
            if (arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
    public void showElements(){
        if (count == 0){
            System.out.println("[]");
        }
        else{
            System.out.print("[");
            for (int i = 0; i< count;i++){
                if(i == count-1){
                    System.out.print(arr[i]);
                }
                else {
                    System.out.print(arr[i]+", ");
                }

            }
            System.out.print("]");
        }
    }
}
public class StackExample {

    public static void main(String[] args) {

        ArrayCRUDExample ref = new ArrayCRUDExample();
        ref.add(10);
        ref.add(20);
        ref.add(30);
        ref.add(40);
        ref.add(50);
        ref.showElements();
        ref.delete(2);
        ref.showElements();
       // System.out.println(ref);
        ref.set(0,500);
        ref.set(1,800);
        ref.showElements();
        ref.get(3);
    }

}
