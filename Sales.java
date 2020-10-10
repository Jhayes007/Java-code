/* 
   Filename: Sales.java
   Author: J.Hayes
   Date: Mar. 02, 2020
   Purpose: To demonstrate integration of most of the concepts we have covered
            since the beginning of the course.
            This class "Sales.java," uses the SalesData class and the methods in it.   
*/

import javax.swing.JOptionPane;

public class Sales
{
   public static void main(String[] args)
   {
      final int SIZE = 7;
      
      // Create an array for sales amount for a week
      double[] sales = new double[SIZE];
      
      // Get the sales figures
      getValue(sales);
      // Create a SalesData object, initialized with week's sales figures
      SalesData weekSales = new SalesData(sales);
      
      // Display the total, average, highest, and the lowest sales amounts for the week
      JOptionPane.showMessageDialog(null,
                  String.format("The total sales were $%,.2f\n" +
                              "The average sales were $%,.2f\n" +
                              "The highest sales were $%,.2f\n"  +
                              "The lowest sales were $%,.2f\n",
                              weekSales.getTotal(), weekSales.getAverage(),
                              weekSales.getHighest(), weekSales.getLowest()));
      System.exit(0);
                     
      
      
   }  // end main
   
   // The getValues() method
   private static void getValue(double[] arr)
   {
      String input;  // for user input
      
      // Get the sales figures
      for (int i = 0; i < arr.length; i++)
      {
         input = JOptionPane.showInputDialog("Enter the sales for day " +
         (i+1) + ": ");
         arr[i] = Double.parseDouble(input);
      }  // end for
   }  // end getValues()
}  // end class


