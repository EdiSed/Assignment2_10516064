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
public class CountingMachineRevisited 
{
     public static void main(String[] args) 
     {
        //variable decalaration and Scanner object creation
        int userInput1, userInput2, userInput3;
        
        Scanner input = new Scanner (System.in);
        userInput1 = input.nextInt();
        
        System.out.print("Count from: ");
        
        
        System.out.print("Count to: ");
        userInput2 = input.nextInt();
        
        System.out.print("Count by: ");
        userInput3 = input.nextInt();
        
        for (int i =userInput1 ; i <= userInput2; i+=userInput3)
        {
            System.out.println(i + " ");
        }
    }
    
}


