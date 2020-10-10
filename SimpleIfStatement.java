/* 
   Filename: SimpleIfstatement.java
   Author: J.Hayes
   Date: Jan. 27, 2020
   Purpose: To demonstrate a simple If statement in java.            
*/

import java.util.Scanner;

public class SimpleIfStatement
{

   public static void main(String[] args)
   {
      double score1, score2, score3, average;
      
      // Create a scanner object
      Scanner keyboard = new Scanner(System.in);
      // Get the scores
      System.out.println("This average three test scores.");
      System.out.print("Enter score #1: ");
      score1 = keyboard.nextDouble();
      System.out.print("Enter score #2: ");
      score2 = keyboard.nextDouble();
      System.out.print("Enter score #3: ");
      score3 = keyboard.nextDouble();
      
      // Calcualte the average and display it
      average = (score1 + score2 + score3) / 3.0;
      System.out.println("The average is " + average);
      
      // If the average is higher than 95, congragulate the user
      if (average > 95)
         System.out.println("Congragulations. That's a great score!");
         
      // Using the conditional operator
      System.out.println(average > 95 ? "Very Good" : "Less than 95%");
         
   } // end main()
}// end class
