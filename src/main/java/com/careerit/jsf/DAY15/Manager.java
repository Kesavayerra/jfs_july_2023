package com.careerit.jsf.DAY15;

class C1{
        void show(){
            System.out.println("C1");
        }
}


class c2{
    void display(){
            System.out.println("C2");

            C1 obj = new C1();
            obj.show();
    }
}
public class Manager {
}
