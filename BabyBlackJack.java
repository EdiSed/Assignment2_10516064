/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10516064;

/**
 *
 * @author edinamsedo
 */
public class BabyBlackJack 
{
    public static void main(String[] args) 
    {
        //variable declaration
        int user1 = (int)(10*Math.random()+1);
        int user2 = (int)(10*Math.random()+1);
        int userSum = user1 + user2;
        
        System.out.println("You drew "+user1+" and "+user2);
        System.out.println("Your total is "+userSum);
        
        int dealer1 = (int)(10*Math.random()+1);
        int dealer2 = (int)(10*Math.random()+1);
        int dealerSum = dealer1+dealer2;
        
        System.out.println("You drew "+dealer1+ " and "+dealer2);
        System.out.println("Dealer's total is "+dealerSum);
        
        //finding the winner
        if (userSum > dealerSum)
        {
            System.out.println("YOU WIN!");
        }
        else
        {
            System.out.println("DEALER WINS");
        }
        
        
    }
    
}
 

