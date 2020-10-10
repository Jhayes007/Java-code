/* 
   Filename: RollDice.java
   Author: J.Hayes
   Date: Feb. 12, 2020
   Purpose: To demonstrate how to generate pseudo-random numbers.
            This program simulates the rolling of dice.
*/

import java.util.Scanner;
import java.util.Random;

public class RollDice
{
   public static void main(String[] args)
   {
      // Variable declarations
      String again = "y";  // Loop control variable
      int die1, die2;   // To hold the values of two rolled dice
      
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object to generate pseudo-numbers
      Random rand = new Random();
      
      // Simulate the rolling of the dice
      while (again.equalsIgnoreCase("y"))
      {
         System.out.println("Rolling the dice ... ");
         die1 = rand.nextInt(6) + 1;
         die2 = rand.nextInt(6) + 1;
         System.out.println("Their values are: ");
         System.out.println(die1 + "    " + die2);
         
         System.out.print("Roll them again (y = yes)?");
         again = keyboard.nextLine();
      }  // end while
   }  // end main()
}  // end class
