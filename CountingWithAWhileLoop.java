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
public class CountingWithAWhileLoop 
{
    

    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type in a message, and i'll display it fives times.");
        System.out.print("Message: ");
        
        String message = input.nextLine();
        
        int n = 0;
        while (n<5)
        {
            System.out.println((n+1) + "." + message);
            n++;
        }
               
    }
 
    
}
