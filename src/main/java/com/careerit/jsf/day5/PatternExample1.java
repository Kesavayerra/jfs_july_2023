/*
01
02
03
10
12
13
20
21
23
30
31
32
*/

package com.careerit.jsf.day5;

import java.util.Scanner;

public class PatternExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m value : ");
        int m = sc.nextInt();
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();

        for (int i=0; i<=m;i++){
            for (int j=0; j<=n;j++){
                if (i !=j){
                    System.out.println(i+""+j+" ");
                }
            }
        }
    }
}
