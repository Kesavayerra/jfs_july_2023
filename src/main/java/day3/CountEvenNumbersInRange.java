package day3;

import java.util.Scanner;

public class CountEvenNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the LB value : ");
        int lb = sc.nextInt();
        System.out.println("Enter the UB Value : ");
        int ub = sc.nextInt();
        int countevenno = 0;
        int countoddno=0;
        for (int i=lb; i<=ub; i++){
            if(i%2==0){
                countevenno +=1;
            }
            else{
                countoddno +=1;
            }

        }
        System.out.println("Count of even numbers between "+lb+" and "+ ub+" is "+countevenno);



    }
}
