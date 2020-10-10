/* 
   Filename: SalesData.java
   Author: J.Hayes
   Date: Mar. 02, 2020
   Purpose: To demonstrate integration of most of the concepts we have covered
            since the beginning of the course.
            In this class "SalesData.java," we will get the running total, the
            average, the lowest and the highest elements of an array.     
*/

public class SalesData
{
   private double[] sales; // The sales data
   
   // Constructor
   public SalesData(double[] s)
   {
      sales = new double[s.length];
      
      
      // Copy the elements from s to sales
      for (int sub = 0; sub < s.length; sub++)
         sales[sub] = s[sub];
   } // constructor     
      
    // The getTotal() method
   public double getTotal()
   {
      
      double total = 0.0;
   
      // Accumulate the array elements
      for (double elm : sales)
         total += elm;
      
      return total;
   }  // end getTotal()
   
   // The getAverage() method
   public double getAverage()
   {
      return getTotal(); // sales.length;
   }  // end getAverage()
   
   // The getHighest() method
   public double getHighest()
   {
      double highest = sales[0];
      
      for (int index = 0; index < sales.length; index++)
      {
         if (sales[index] > highest)
            highest = sales[index];
      }  // end for
      
      return highest;
   }  // end getHighest()
   
    // The getLowest() method
   public double getLowest()
   {
      double lowest = sales[0];
      
      for (int index = 0; index < sales.length; index++)
      {
         if (sales[index] < lowest)
            lowest = sales[index];
      }  // end for
      
      return lowest;
   }  // end getHighest()

}  // end class
