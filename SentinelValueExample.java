/* 
   Filename: SentinelValueExample.java
   Author: J.Hayes
   Date: Feb. 5, 2020
   Purpose: To demonstrate the use of the loops in java. This is an example
         of the use of a sentinel value.
*/

import java.util.Scanner;

public class SentinelValueExample
{
   public static void main (String[] args)
   {
      int points;
      int totalPoints = 0; // Accumulator
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // General Instructions
      System.out.println("Enter the number of points your team has earned for each game this season.");
      System.out.println("Enter -1 when finished.");
      System.out.println();   // blank line
    
      // Priming read for the loop
      System.out.print("Enter game points or -1 to end: ");
      points = keyboard.nextInt();
      
      // Add the points until -1 is entered
      while (points != -1) // -1 is the sentinel value here
      {
         // Add points to the accumulator
         totalPoints += points;
         // Get the next number of points
         System.out.print("Enter game points or -1 to end: ");
         points = keyboard.nextInt();
      }  // end while
      
      // Display the total number of points
      System.out.println("The total points are " + totalPoints);
      
    }  // end main()
}  // end class
