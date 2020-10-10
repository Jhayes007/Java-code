/* 
Filename: Grader.java
Author: J.Hayes
Date: Mar. 04, 2020
Purpose: To demonstrate an object that processed an array. This is the 
            Grader class and will be used in the calcAverage class.
*/

public class Grader
{
   // field --- array
   private double[] testScores;
   
   /** 
      Constructor
   @param scoreArray An array of test scores
   */
   public Grader(double[] scoreArr)
   {
      testScores = scoreArr;
   }  // end constructor
   
   /** 
      getLowestScore() method
      @return the lowest score
   */
   public double getLowestScore()
   {
      double lowest;
      
      lowest = testScores[0];
      
      for (int i = 0; i < testScores.length; i++)
         if (testScores[i] < lowest)
            lowest = testScores[i];
         
      return lowest;
   }  // end getLowestScore()     
   
   /**
      getAverage method
      @return the average score from the array with the lowest
            score dropped.
   */
   public double getAverage()
   {
      double total = 0.0;
      double lowest;
      double average;
      
      if (testScores.length < 2)
      {
         System.out.println("ERROR: You must have at least two scores!");
         average = 0.0;
      }
      else
      {
         // Calculate total
         for (double score : testScores)
            total += score;
         // Get the lowest score
         lowest = getLowestScore();
         // Subtract the lowest score from the total
         total -= lowest;
         // Get the adjusted average
         average = total / (testScores.length - 1);
      }  // end if-else
      
      return average;
   }  // end getAverage()
}  // end class

