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
public class KeepGuessing 
{
     public static void main(String[] args)
     {
        //variable declaration and scanner object creation
        int compuGuess, userGuess;
       
        Scanner input = new Scanner (System.in);
        
        //generate random number and store in compuGuess
        compuGuess = (int)(10*Math.random()+1);
        //prompt statement
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        //accept user's input
        userGuess = input.nextInt();
        
        
        //tests
        while (userGuess != compuGuess)
        {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess ");
            userGuess = input.nextInt();
           
        }
        if (userGuess == compuGuess)
        {
            System.out.println("That's right! You're a good guesser");
            
        }
     }
    
}


