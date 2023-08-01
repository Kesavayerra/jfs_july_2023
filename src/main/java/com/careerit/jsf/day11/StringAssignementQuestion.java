package com.careerit.jsf.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Read data from names.txt file store in the list and find the names which starts with A and display first 3 chars of each name in Upper Class
public class StringAssignementQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(StringAssignementQuestion.class.getResourceAsStream("/names.txt"));
        List<String> names = new ArrayList<>();
        while (sc.hasNextLine()){
            names.add(sc.nextLine());
        }
        for (String name:names){
            System.out.println(name.substring(0,3).toUpperCase());
        }
        //System.out.println(names);
    }


}
