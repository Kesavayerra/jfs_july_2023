package com.careerit.jsf.day13;
class Account {
    public static final String BANK_NAME="SBI";
    static {
        System.out.println("This is a Static block of Account class");
    }

    public static void showInfo(){
        System.out.println("This is show info method");
    }
}
public class StaticBlockWithExample {
    static{
        System.out.println("This is a Static block with StaticBlockWithExample class");
    }

    public static void main(String[] args) {
        Account.showInfo();
        System.out.println("Main Method");
    }
}
