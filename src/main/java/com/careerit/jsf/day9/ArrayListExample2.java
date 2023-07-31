package com.careerit.jsf.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {
        List<String> nameList1 = new ArrayList<>();
        nameList1.add("Krish");
        nameList1.add("Manoj");
        List<String> nameList2 = new ArrayList<>();
        nameList2.add("Aadhya");
        nameList2.add("Dhatri");
        List<String> nameList3 = new ArrayList<>();
        nameList3.addAll(nameList1);
        nameList3.addAll(nameList2);

        System.out.println(nameList3);
        System.out.println(nameList3.containsAll(nameList1));
        System.out.println(nameList3.containsAll(nameList1));



    }
}
