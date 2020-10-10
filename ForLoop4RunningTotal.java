/* 
   Filename: ForLoop4RunningTotal.java
   Author: J.Hayes
   Date: Feb. 3, 2020
   Purpose: To demonstrate the use of the for loop in java. This is an example
         of calculating running totals
*/

import javax.swing.JOptionPane;

public class ForLoop4RunningTotal
{
   public static void main(String[] args)
   {
      // Variable declarations
      int days;
      double sales;
      double totalSales = 0.0;   // Accumulator
      String input;
      
      // Get the number of days
      input = JOptionPane.showInputDialog("For how many days do you have sales figures? ");
      days = Integer.parseInt(input);
      
      // Get the sales figures and calculate a running total
      for (int count = 1; count <= days; count++)
      {
         input = JOptionPane.showInputDialog("Enter the sales for the day " + count + ": ");
         sales = Double.parseDouble(input);
         totalSales += sales; // Add sales to the accumulator
      }  // end for
      
      // Display the total sales
      JOptionPane.showMessageDialog(null, String.format("The total sales are $%,.2f",
                  totalSales));
      System.exit(0);
   }  // end main()
}  // end class
