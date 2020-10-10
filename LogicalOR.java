/* 
   Filename: LogicalOr.java
   Author: J.Hayes
   Date: Jan. 29, 2020
   Purpose: To demonstrate use and functioning of the logical OR operator (||) in java.            
*/

import javax.swing.JOptionPane;

public class LogicalOR
{
   public static void main(String[] args)
   {
      double salary; // Annual salary
      double yearsOnJob;   // Years at current job
      String input;  // To hold input
      
      // Get the user's annual salary
      input = JOptionPane.showInputDialog("Enter your annual salary: ");
      salary = Double.parseDouble(input);
      // Get the user's # years on job
      input = JOptionPane.showInputDialog("Enter the number of years at your current job: ");
      yearsOnJob = Double.parseDouble(input);
      
      // Determine whether the user qualifies for a loan.
      // An employee gets the loan if salary >= $30,000 and has been on the job 
      // for at least two years.
      if (salary >= 30000 || yearsOnJob >= 2)
      JOptionPane.showMessageDialog(null, "You qualify for the loan.");
      else
      JOptionPane.showMessageDialog(null, "You do not qualify for the loan.");
      
      System.exit(0);
  }   // end main()
}  // end class
