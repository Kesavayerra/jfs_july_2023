package com.careerit.jsf.DAY15;

// Writing2 or more methods in same class with different parameters is called method overloading
// Overloading takes place in same class and t doesnt matter access specifier
class MathOperations{
    public static int add(int a, int b){
      return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static float add(float a, float b){
        return a+b;
    }

    public static float add(float a,float b, float c){
        return a+b+c;
    }

    public static float add(int a, float b){
        return a+b;
    }

    public static float add(float a, int b){
        return a+b;
    }


}
public class OverloadingExample {

}
