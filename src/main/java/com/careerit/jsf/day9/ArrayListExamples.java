package com.careerit.jsf.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,3,4,5,4,5,6,7,7,7,8,9,10};
        List<Integer> list = new ArrayList<>();
        // Add all the elements from array to List, ensure there is no duplicate elements;
        for (int ele:arr){
            if (!list.contains(ele)){
                list.add(ele);
            }

        }
        System.out.println(list);
    }
}
