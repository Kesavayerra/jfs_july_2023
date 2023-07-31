package com.careerit.jsf.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

    public static void main(String[] args) {

        List<String> storeList1 = getProductSold("Store1");
        List<String> storeList2 = getProductSold("Store2");

        // Get unique products sold in both stores => P1, P2, P3, P4, P5, P6, P7
        List<String> uniqueProducts = new ArrayList<>();
        for (String p:storeList1){
            if (!uniqueProducts.contains(p)){
                uniqueProducts.add(p);
            }
        }

        for (String p:storeList2){
            if (!uniqueProducts.contains(p)){
                uniqueProducts.add(p);
            }
        }
        System.out.println(uniqueProducts);
        // Get Products which are sold in both stores => P1, P3, P5
        List<String> productSoldInBothStores = new ArrayList<>();
        for (String p:uniqueProducts){
            if (storeList1.contains(p) && storeList2.contains(p)){
                productSoldInBothStores.add(p);

            }
        }
        System.out.println("Product sold in both stores are: "+productSoldInBothStores);

    }

    private static List<String> getProductSold(String store){
        if (store.equals("store1")){
            return List.of("P1","P2","P3","P4","P5");
        } else {
            return List.of("P1","P3","P5","P6","P7");
        }
    }
}
