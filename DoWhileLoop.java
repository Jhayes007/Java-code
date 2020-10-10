/* 
   Filename: DoWhileLoop.java
   Author: J.Hayes
   Date: Feb. 3, 2020
   Purpose: To demonstrate the use of the do-while loop in java.          
*/

import javax.swing.JOptionPane;

public class DoWhileLoop
{
   public static void main(String[] args)
   {
      int score1, score2, score3;
      double average;
      char repeat;
      String input;
      
      System.out.println("This program calculates the average of three test scores.");
      
      // Get as many sets of test scores as the user wants
      do 
      {
         // Get the first score in this set
       input = JOptionPane.showInputDialog("Enter score #1: ");
       score1 = Integer.parseInt(input);
       // Get the second score in this set
       input = JOptionPane.showInputDialog("Enter score #2: ");
       score2 = Integer.parseInt(input);
       // Get the third score
       input = JOptionPane.showInputDialog("Enter score #3: ");
       score3 = Integer.parseInt(input);
       // Calculate and display the average
       average = (score1 + score2 + score3) / 3.0;
       JOptionPane.showMessageDialog(null, "The average score is " + average);
       
       // Does the user want to average another set?
       input = JOptionPane.showInputDialog("Would you like to average another " + 
                "set of test scores? ");
       repeat = input.charAt(0); // Get the first character of user's entry 
      }  while (repeat == 'Y' || repeat == 'y');  // end do-while loop
   }  // end main()
}  // end class