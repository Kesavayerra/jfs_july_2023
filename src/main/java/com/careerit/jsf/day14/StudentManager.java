package com.careerit.jsf.day14;

public class StudentManager {
    public static void main(String[] args) {
        Student s1= new Student(1001,"Krish",5);
        Student s2 = new Student(1002,"Manoj",5);
        Student s3 = new Student(1003,"Raja",6);
        Student s4 = new Student(1004,"Shyam",7);
        Student s5 = new Student(1005,"Ghana",8);
        Student s6 = new Student(1006,"Rani",2);
        Student s7 = new Student(1007,"Tanvi",4);
        Student s8 = new Student(1008,"Haji",4);
        Student s9 = new Student(1009,"John",9);
        Student s10 = new Student(1010,"Chris",9);

        // added all student elements to array
        Student[] arr = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

        // Promote 9th class student to 10th class
        for (Student s:arr){
            if (s.getStd() == 9){
                s.promote();
            }
        }

        // Display all Students
        for (Student s:arr){
            s.showInfo();
            System.out.println("--------------------------------");
        }


    }
}
