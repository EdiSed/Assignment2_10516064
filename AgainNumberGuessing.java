/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10516064;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author edinamsedo
 */
public class AgainNumberGuessing 
{
     public static void main(String[] args)
     {
        
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int x, y;
        //int x = 1 + r.nextInt(10);
        
        //  int y = 0;
        System.out.println("I'm thinking of a number from 1 to 10. Try to guess it");
          x = 1 + r.nextInt(10); 
       
        do
        {
             
             
             
            //System.out.println("Sorry, that wasn't correct");   
         System.out.println("Your Guess:  ");
         y = input.nextInt();
        }
         while (y != x);
            
            
     
        if ( y == x )
        {
            System.out.println("That,s right! My secret number was " + x);
            
        }
        
       
    
    }
}
