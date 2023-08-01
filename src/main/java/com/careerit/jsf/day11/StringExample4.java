package com.careerit.jsf.day11;

public class StringExample4 {

    public static void main(String[] args) {
        String name = "Learning";
        System.out.println(name.length());
        int n = 3;
        //lea ear arn rni nin ing
        for (int i=0; i<name.length()-n +1; i++ ){
            System.out.println(name.substring(i,i+n));
        }

        String data = "Krish,Manoj,Charan,Allen,Ramesh,Akilesh,Suresh";
                // Get the names which starts with A
        String[] names = data.split(",");
        for (String ele: names){
            if(ele.startsWith("A")){
                System.out.println(ele);
            }
        }



    }
}
