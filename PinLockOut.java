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
public class PinLockOut 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxTries = 4;
        
        System.out.println("WELCOME TO SEDO'S BANK");
        System.out.println("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;
        
        while ( entry != pin && tries < maxTries )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }
        if ( entry == pin )
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if (tries >= maxTries)
            System.out.println("\n4 UNSUCCESSFUL TRIES. ACCOUNT LOCKED.");
    }
    
}


