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
public class ThreeCardMonte 
{
     public static void main(String[]args)
            
    {
       int userGuess;
       int compuGuess;
       compuGuess = (int)(3*Math.random()+1);
       
       System.out.print("You slide up to Fast Eddie's card table and plp down your cash.");
       System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
       System.out.println("He lays down three cards.");
           System.out.println("Which one is the ace?\n");
       System.out.println("\t ## ## ##");
       System.out.println("\t ## ## ##");
       System.out.println("\t 1  2  3");
       
       Scanner input= new Scanner(System.in);
       userGuess = input.nextInt();
       
       if(compuGuess == 1 )
       {
           if (userGuess == compuGuess)
           {
               System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                    System.out.println("\t AA ## ##");
                    System.out.println("\t AA ## ##");
                    System.out.println("\t 1  2  3");
           }
           else 
           {
               System.out.println("Ha! Fast Eddie wins again! The ace was card number "+compuGuess);
                    System.out.println("\t AA ## ##");
                    System.out.println("\t AA ## ##");
                    System.out.println("\t 1  2  3");
           }
       
    }
       
       
       //case of two
       if(compuGuess == 2 )
       {
           if (userGuess == compuGuess)
           {
               System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                    System.out.println("\t ## AA ##");
                    System.out.println("\t ## AA ##");
                    System.out.println("\t 1  2  3");
           }
           else 
           {
               System.out.println("Ha! Fast Eddie wins again! The ace was card number "+compuGuess);
                    System.out.println("\t ## AA ##");
                    System.out.println("\t ## AA ##");
                    System.out.println("\t 1  2  3");
           }
  
       }
       
       
       //case of three
       
       if(compuGuess == 3)
       {
           if (userGuess == compuGuess)
           {
               System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                    System.out.println("\t ## ## AA");
                    System.out.println("\t ## ## AA");
                    System.out.println("\t 1  2  3");
           }
           else 
           {
               System.out.println("Ha! Fast Eddie wins again! The ace was card number "+compuGuess);
                    System.out.println("\t ## ## AA");
                    System.out.println("\t ## ## AA");
                    System.out.println("\t 1  2  3");
           }
       
       
       
    }
    
    
    
    
    
    
    
    }   
    
    
    
}



