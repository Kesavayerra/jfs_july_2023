package com.careerit.jsf.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
// Writing two or methods with same name and different Parameters is called Overloading
class Product{
    private String id;
    private String name;
    private double price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String id, String name, double price){

        this.id = id;
        this.name = name;
        this.price =price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}

public class MethodOverridingExample {
    // Changing of Super class behaviour in sub class is called overriding
    // Points to remember
    // Method name must be same
    // arguments must be same
    // access specifiers must be the same
    // return type must be same
    public static void main(String[] args) {
        Product p1 = new Product("KA01", "Lenovo Thinkpad",89000);
        Product p2 = new Product("KA02", "Dell Studio",99000);
        Product p3 = new Product("KA03", "HP Pavilion",79000);
        Product p4 = new Product("KA04", "Apple MAC Book",75000);
        Product p5 = new Product("KA03", "HP Pavilion",79000);

       // String name1 = "Krish";
       // String name3 = name1;
       // String name2 = new String("Krish");
       // String name4 = new String("Krish");
       // System.out.println(name1==name2);
       // System.out.println(name1==name3);
       // System.out.println(name2==name4);
      //  System.out.println(name2.equals(name4));
       // System.out.println(name1.equals(name3));

        System.out.println(p3==p5);
        System.out.println(p3.equals(p5));

        List<Product>  products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        for (Product p:products){
            //System.out.println(p.getName());
            //System.out.println(p.hashCode());
            //System.out.println(p);
            //System.out.println(p.getClass().getName()+"@"+Integer.toHexString(p.hashCode()));
            System.out.println(p.toString());
            System.out.println(p1.getClass());
        }

    }
}
