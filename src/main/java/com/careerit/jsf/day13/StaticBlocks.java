package com.careerit.jsf.day13;

public class StaticBlocks {
    static{
        System.out.println("This is static block1");
    }
    static{
        System.out.println("This is static block2");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static{
        System.out.println("This is static block3");
    }

}
