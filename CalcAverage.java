/* 
Filename: CalcAverage.java
Author: J.Hayes
Date: Mar. 04, 2020
Purpose: To demonstrate an object that processed an array. This is the 
           CalcAverage class that uses the Grader class that has a field that is
           an array
*/

import java.util.Scanner;

public class CalcAverage
{
   public static void main(String[] args)
   {
     int numScores;  // Number of scores
     
     Scanner keyboard = new Scanner(System.in);
     
     // The get the number of scores from the user
     System.out.print("How many test scores do you have? ");
     numScores = keyboard.nextInt();
     
     // Create an array for the test scores
     double[] scores = new double[numScores];
     
     // Get the scores
     for (int i = 0; i < numScores; i++)
     {
         System.out.print("Enter score #: " + (i+1) + ": ");
         scores[i] = keyboard.nextDouble();
     }   // end for
     
     // Create a Grader object, pass the scores array to it as an argument.
     Grader myGrade = new Grader(scores);
     
     // Display the adjusted average
     System.out.println("Your adjusted average is " + myGrader.getAverage());
     // Display the lowest score
     System.out.println("Your lowest score was " + myGrader.getLowestScore());
   }  // end main()
}  // end class

