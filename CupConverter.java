/* 
   Filename: CupConverter.java
   Author: J.Hayes
   Date: Feb. 17, 2020
   Purpose: To demonstrate how to create and use a module/method in Java.
            In this example there are several methods. This application will
            convert cups to fluid ounces (analogous to what we did in logic)
*/

import javax.swing.JOptionPane;

public class CupConverter

{
/**
   The getCups() method prompts the user to enter a number of cups.
   @return The number of cups entered by the user
*/
   public static double getCups()
   {
      String input;  // For user input
      double numCups;   // # cups
      
      // Get input from the user
      input = JOptionPane.showInputDialog("This program converts measurements\n" +
         "in cups to fluid ounces. For your reference\n" +
         "the formula is: 1 cup = 8 fluid ounces\n\n" +
         "Enter the number of cups: ");
         // Convert the input to double
         numCups = Double.parseDouble(input);
         
         // Return the number of cups
         return numCups;
   }  // end getCups()
   
   /**
      The cupsToOunces() method converts a number of cups to fluid ounces,
      using the formula acup = 8 fluid ounces.
      @param nC the number of cups to convert.
      @return The number of fluid ounces.
   */
   public static double cupsToOunces(double nC)
   {
      return nC * 8.0;
   }  // end cupsToOunces()
   
   /**
      The displayResults() method displays a message showing the results of the
      conversion.
      @param cups A number of cups
      @param ounces Number of fluid ounces
   */
   public static void displayResults(double cups, double ounces)
   {
      JOptionPane.showMessageDialog(null, cups + " cups equals " + ounces +
            " fluid ounces.");
   }  // end displayResults
  
   public static void main(String[] args)
{
   double cups;
   double ounces;
   
   // Get the # of cups
   cups = getCups();
   
   // Convert to fluid ounces 
   ounces = cupsToOunces(cups);
   
   // Display the results
   displayResults(cups, ounces);
   System.exit(0);
 }  // end main()
}  // end class  