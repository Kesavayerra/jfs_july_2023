package com.careerit.jsf.day2;

import java.util.Scanner;

public class IncomeTaxCalaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Income : ");
        int TotalIncome = sc.nextInt();
        double Tax=0;
        double educationcess=0;
        double secondaryeducess=0;

        if (TotalIncome <= 200000){
            Tax = 0;
            educationcess=0;
            secondaryeducess=0;
        }

        else if (TotalIncome > 200000 && TotalIncome <= 500000){
            Tax = (TotalIncome-300000) * 0.1+((TotalIncome-300000) * 0.1)*.02+((TotalIncome-300000) * 0.1)*.01;
            educationcess=((TotalIncome-300000) * 0.1)*0.02;
            secondaryeducess=((TotalIncome-300000)*0.1)*0.01;
        }

        else if (TotalIncome > 500000 && TotalIncome <= 1000000){
            Tax = 20000+(TotalIncome-500000) * 0.2+(20000+(TotalIncome-500000) * 0.2)*.02+(20000+(TotalIncome-500000) * 0.2)*.01;
            educationcess=(20000+(TotalIncome-500000) * 0.2)*0.02;
            secondaryeducess=(20000+(TotalIncome-500000) * 0.2)*0.01;
        }

        else {
            Tax = 120000+((TotalIncome-1000000) * 0.3)+((120000+(TotalIncome-1000000) * 0.3))*.02+((120000+(TotalIncome-1000000) * 0.3))*.01;
            educationcess=(120000+((TotalIncome-1000000) * 0.3))*.02;
            secondaryeducess=(120000+((TotalIncome-1000000) * 0.3))*.01;
        }

        System.out.println("For Income "+TotalIncome+ " Total tax is "+Tax);
        System.out.println("For Income "+TotalIncome+" education cess is "+educationcess);
        System.out.println("For Income "+TotalIncome+" Secondary education cess is "+secondaryeducess);

    }
}
