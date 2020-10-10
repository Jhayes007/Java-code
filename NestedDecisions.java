/* 
   Filename: NestedDecisions.java
   Author: J.Hayes
   Date: Jan. 27, 2020
   Purpose: To demonstrate how nested if statements function in java.            
*/

import javax.swing.JOptionPane;

public class NestedDecisions
{
   public static void main(String[] args)
   {
      int testScore; // Numeric test score
      String input;  // To hold the input
      
      // Get the score
      input = JOptionPane.showInputDialog("Enter your numeric test score and I will tell you the grade: ");
      testScore = Integer.parseInt(input);
      
      // Convert the score to a letter grade and display it 
      if (testScore < 60)
      {
         JOptionPane.showMessageDialog(null, "Your grade is F.");
      }
      else
      {
         if (testScore < 70)
            JOptionPane.showMessageDialog(null, "Your grade is D.");
         else
         {
            if (testScore < 80)
            JOptionPane.showMessageDialog(null, "Your grade is C.");
            else
            {
               if (testScore < 90)
               JOptionPane.showMessageDialog(null, "Your grade is B.");
               else
               JOptionPane.showMessageDialog(null, "Your grade is A."); // end inner-most if-else
               
         } // end if-else
       }  // end if
     }  // end outer-most if-else
     
     // Compact version of the above if-else statement
         if (testScore < 60)
            JOptionPane.showMessageDialog(null, "2-Your grade is F.");
          else if (testScore < 70)
            JOptionPane.showMessageDialog(null, "2-Your grade is D.");
          else if (testScore < 80)
            JOptionPane.showMessageDialog(null, "2-Your grade is C.");
          else if (testScore < 90)
            JOptionPane.showMessageDialog(null, "2-Your grade is B.");
           else if (testScore <= 100)
            JOptionPane.showMessageDialog(null, "2-Your grade is A."); // end inner-most if-else
            else
            JOptionPane.showMessageDialog(null, "2-The score entered is invalid and greater than 100.");
               
     System.exit(0); // To close all threads in the application using graphics.
   }  // end main()
}  // end class