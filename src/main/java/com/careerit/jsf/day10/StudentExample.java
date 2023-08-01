package com.careerit.jsf.day10;

import java.util.ArrayList;
import java.util.List;

class Student{
    int rollno;
    String name;
    int std;

    public Student(int rollNo, String name, int std){
        this.rollno = rollNo;
        this.name = name;
        this.std = std;
    }

    public void showInfo(){
        System.out.println("Rollno :"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Standard :"+std);

    }

   // public void changeStd(int std){
    //    this.std = std+1;
   // }

    public void promote(){
        this.std = this.std+1;
    }

}
public class StudentExample {
    public static void main(String[] args) {

        Student s1 = new Student(1001,"Krish",5);
        Student s2 = new Student(1002,"Manoj",9);
        Student s3 = new Student(1003,"Charan",4);
        Student s4 = new Student(1004, "Tanvi",6);
        Student s5 = new Student(1005,"Manasa",7);
        Student s6 = new Student(1006,"Sai Kumar", 8);
        Student s7 = new Student(1007,"Sai Ram", 8);
        Student s8 = new Student(1008,"Sai Charan", 8);
        Student s9 = new Student(1009,"Sainath", 8);
        Student s10 = new Student(1010,"Sairam", 8);

        List<Student> studentList = new ArrayList<>(List.of(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10));

        for (Student student:studentList){
            System.out.println("-".repeat(50));
                if(student.std ==9){
                    student.promote();
            }
        }

        for(Student student:studentList){
            student.showInfo();
            System.out.println("-".repeat(50));
        }

        //s1.showInfo();
        //s2.showInfo();
        //s3.showInfo();
    }
}
