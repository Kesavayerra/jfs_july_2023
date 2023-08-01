package com.careerit.jsf.day11;

public class Product {
    private long pid;
    private String pname;

   private double price;

   public Product(long pid, String pname, double price){
       this.pid = pid;
       this.pname=pname;
       this.price=price;
   }

   public void showDetails(){
       System.out.println("Product ID    :"+pid);
       System.out.println("Product Name  :"+pname);
       System.out.println("Product Price :"+price);
   }


}
