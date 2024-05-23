/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task1;

/**
 *
 * @author SINDISWA
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int min = 1;
            int max = 100;
            int attemptsLimit = 5; 
            int score = 0;
            boolean playAgain = true;
           
            System.out.println("Welcome to Sindiswa's Guessing Game!");
           
            while (playAgain) {
                int randomNumber = random.nextInt(max - min + 1) + min;
                int attempts = 0;
                boolean guessedCorrectly = false;
               
                System.out.println("I have generated a number between " + min + " and " + max + ".");
                System.out.println("You have " + attemptsLimit + " attempts to guess it.");
               
                while (attempts < attemptsLimit && !guessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();
                    scanner.nextLine();
                   
                    if (guess == randomNumber) {
                        System.out.println("Congratulations! You've guessed the correct number.");
                        guessedCorrectly = true;
                        score++;
                    } else if (guess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
                   
                    attempts++;
                }
               
                if (!guessedCorrectly) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
                }
               
                System.out.println("Your current score: " + score);
               
               
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainResponse = scanner.nextLine();
                playAgain = playAgainResponse.equalsIgnoreCase("yes");
            }
           
            System.out.println("Thank you for playing!");
        }
    }
}
