package com.careerit.jsf.day14;


public class Student {

    private long regNo;
    private String name;
    private int std;

    public Student(long regNo, String name, int std){
        //this(regNo,name,std);
        this.regNo = regNo;
        this.name = name;
        this.std = std;
    }

    public void promote(){
        this.std++;
    }

    public long getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public int getStd() {
        return std;
    }

    public void showInfo(){
        System.out.println("Registration No :"+regNo+"\nName :"+name+"\nStandard :"+std);
    }
}
