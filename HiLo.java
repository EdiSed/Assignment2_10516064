/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10516064;
import java.util.Scanner;

/**
 *
 * @author edinamsedo
 */
public class HiLo 
{
    public static void main(String[]args)
    {
        int userGuess;
        int guess = 0;
        int compuGuess = (int) (100*Math.random()+1);
        
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 - 100. You have 7 guesses. ");
        System.out.print("First guess: ");
        userGuess = input.nextInt();
        guess++;
        int no = 2;
        
       
        while (userGuess != compuGuess && guess < 7)
        {
        if (userGuess > compuGuess)
            {
                System.out.println("Sorry, that guess is too high.");   
            }
        else if (userGuess < compuGuess)
        {
            System.out.println("Sorry, you are too low");
        }
        else
        {
            System.out.println("You guessed it! What are the odds?!?");
        }
        if (guess >= 7)
        {
            System.out.println("Sorry, you didn't guess it in seven tries. You lose.");
        }
            System.out.print("Guess # " + no + ": ");
            userGuess = input.nextInt();
            guess++;
            no++;
        }
        if (userGuess == compuGuess)
        {
            System.out.println("You guessed it! What are the odds?!?");
        }
        
                
            
                
        
        
    }
    
}

