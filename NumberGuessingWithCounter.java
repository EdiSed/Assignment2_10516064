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
public class NumberGuessingWithCounter 
{
    public static void main(String[] args)
    {
       
        int compuGuess, userGuess;
        int tries = 0;
        Scanner input = new Scanner (System.in);
        
        //generate random number and store in compuGuess
        compuGuess = (int)(10*Math.random()+1);
      
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        
        userGuess = input.nextInt();
        tries++;
        
        //tests
        while (userGuess != compuGuess)
        {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            userGuess = input.nextInt();
            tries++;
            
        }
        
        if (userGuess == compuGuess)
        {
            System.out.println("That's right! You are a good guesser");
            System.out.println("It only took you "+tries+ " trie(s).");
        }
        
        
    }
}