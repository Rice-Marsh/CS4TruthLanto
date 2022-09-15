/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int min = 1;
        int max = 10;
        int numGuess = 3;
        String userCont = "y";
        
        do{
            System.out.println("Welcome to Higher or Lower! What will you do?"
                    + "\n-Start Game \n-Change Settings \n-End Application");
            
            String userChoice = sc.nextLine();
            
            if (userChoice.equalsIgnoreCase("start game")){
                int random = (int) Math.floor(Math.random()* max) + min;
               
                
                for (int i = numGuess; i > 0; i--){
                    System.out.printf("You have %d guess(es) left. What is your guess?", i);
                    
                    String guess = sc.nextLine();
                    int verGuess = Integer.parseInt(guess);
                    
                    if (verGuess == random){
                        System.out.println("You got it!");
                        break;
                    }
                    
                    if (verGuess > random){
                        System.out.println("Guess Lower!");
                    }
                    
                    if (verGuess < random){
                        System.out.println("Guess Higher");
                    }
                    
                    else if (verGuess != random && i == 1){
                        System.out.println("You lost...");
                        break;
                    }
                }
                
                System.out.println("Restart? (y/n)");
                String inpUser = sc.nextLine();
                userCont = inpUser;
            }
            
            if (userChoice.equalsIgnoreCase("change settings")){
                System.out.println("Change lower and upper limit and amount of guesses");
                System.out.println("Lower Limit: ");
                String minNew = sc.nextLine();
                System.out.println("Upper Limit: ");
                String maxNew = sc.nextLine();
                System.out.println("Guesses: ");
                String guessNew = sc.nextLine();
                
                min = Integer.parseInt(minNew);
                max = Integer.parseInt(maxNew);
                numGuess = Integer.parseInt(guessNew);
            }
            
            if (userChoice.equalsIgnoreCase("end application")){
                System.out.println("OK, goodbye");
                userCont = "n";
            }
        } while("y".equals(userCont));
    }
    
}
