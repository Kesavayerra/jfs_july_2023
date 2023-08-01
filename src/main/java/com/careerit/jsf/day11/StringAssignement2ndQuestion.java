package com.careerit.jsf.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Read product details from product.txt file and store in the list and display all products
public class StringAssignement2ndQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(StringAssignement2ndQuestion.class.getResourceAsStream("/product.txt"));
        List<Product> products = new ArrayList<>();
        while (sc.hasNext()){
            String line = sc.nextLine();
            //System.out.println(line);
            String[] arr = line.split(",");
            long pid = Long.parseLong(arr[0]);
            String pname = arr[1];
            double price = Double.parseDouble(arr[2]);

            Product product = new Product(pid,pname,price);
            products.add(product);
            //products.add(product);

        }

        for (Product product:products){
            product.showDetails();
            System.out.println("------------------------");

        }
    }
}
