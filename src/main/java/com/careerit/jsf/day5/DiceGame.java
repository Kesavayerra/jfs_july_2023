package com.careerit.jsf.day5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int generatedNumber = ThreadLocalRandom.current().nextInt(1,7);
        for(int i=1; i <=3; i++ ){
            System.out.println("Guess the number between 1 to 6: ");
            int guessedNumber = sc.nextInt();
            if (guessedNumber<generatedNumber){
                System.out.println("Guessed Number is less than the Generated Number");
            } else if (guessedNumber>generatedNumber){
                System.out.println("Guessed Number is greater than the Generated Number");
            } else {
                System.out.println("You Won the Game, you guessed the number in " + i + " attempts");
                break;
            }
            if (i ==3){
                    System.out.println("You reached the max attempts, you lost the game. generated number is "+generatedNumber);
                }
            }
        }

    }

