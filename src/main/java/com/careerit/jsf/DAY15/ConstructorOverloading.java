package com.careerit.jsf.DAY15;

import javax.lang.model.element.Name;

class Employee{
    private int empno;
    private String name;
    private String email;
    private String mobile;
    private String city;


    public Employee(int empno, String name, String email){
        this(empno,name,email,"N/A","N/A");
    }

    public Employee(int empno, String name, String email, String mobile){
        this(empno,name,email,mobile,"N/A");
    }

    public Employee(int empno, String name, String email, String mobile, String city){
        this.empno = empno;
        this.name = name;
        this.email= email;
        this.mobile = mobile;
        this.city = city;
    }

    public void showDetails(){
        System.out.println("Emp no :"+empno);
        System.out.println("Name :"+ name);
        System.out.println("Email :"+email);
        System.out.println("Mobile :"+mobile);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"A","a@a.com","123","AAA");
        Employee e2 = new Employee(1002,"B","B@B.com","1289","B");
        Employee e3 = new Employee(1003, "C","C@C.com");
        Employee e4 = new Employee(1004, "D","D@D.com","1289");
            e1.showDetails();
            e2.showDetails();
            e3.showDetails();
            e4.showDetails();

    }
}
