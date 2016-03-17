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
public class AddingValuesInALoop 
{
    public static void main(String[] args){
        //variable declaration and scanner object creation
        int userInput;
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("I will add up the following numbers you give me.");
        
        //accept input
        System.out.print("Number: ");
        userInput = input.nextInt();
        
        while (userInput != 0) {
        
            sum += userInput;
            System.out.println("The toatal so far is : "+sum);
            System.out.print("Number: ");
            userInput = input.nextInt();
        }
        
        if (userInput == 0){
            System.out.println();
            System.out.println("The total is "+sum);
        }
    }
    
}


