package com.careerit.jsf.day10;
class Employee{
    long empno;
    String name;
    double salary;
    public Employee(long empno, String name, double salary){
        this.empno = empno;
        this.name = name;
        this.salary = salary;

    }

    public void showInfo(){
        System.out.println("Empno:" +empno);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }

    public void incrementSalary(double amount){
        salary += amount;

    }
}
public class EmployeeManager {

    public static void main(String[] args) {
        // create 10 employee objects and store in array list and perform the following operations
        // display all employee details by calling showinfo method
        // display all the employee details whose salary greater than 50000
        //Find the sum of all employee salaries
        //Increment all employee salary by 10%
         //   Display details of all employees

    }
}
