package day2;

import java.util.Scanner;

public class ScoreAndGrade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Score :");
        int score = sc.nextInt();
        String grade;
        if (score>=1 && score <= 5){
            grade = "C";
        } else if (score>=6 && score <= 8 ) {
            grade = "B";
        } else if (score>=9 && score <= 10 ) {
            grade = "A";
        }

        else {
            grade = "Invalid score";
        }
        System.out.println("Score : "+ score);
        System.out.println("Grade : "+ grade);

    }
}
