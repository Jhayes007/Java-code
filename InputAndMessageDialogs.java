/* 
   Filename: InputAndMessageDialogs.java
   Author: J.Hayes
   Date: Jan. 22, 2020
   Purpose: To demonstrate the input and message dialogs in java.            
*/

import javax.swing.JOptionPane;

public class InputAndMessageDialogs
{
   public static void main(String[] args)
   {
      String inputString;  // For reading input
      String name;
      int hours;
      double payRate;
      double grossPay;
      
      // Get the user's name
      name = JOptionPane.showInputDialog("What is your name? ");
      // Get hours worked
      inputString = JOptionPane.showInputDialog("How many hours did you work? ");
      hours = Integer.parseInt(inputString);
      // Get the hourly pay rate
      inputString = JOptionPane.showInputDialog("What is your hourly pay rate? ");
      payRate = Double.parseDouble(inputString);
      
      // Calculate the gross pay
      grossPay = hours * payRate;
      // Display the result in a message box
      JOptionPane.showMessageDialog(null, "Hello " + name +
                        " . Your gross pay is $" + grossPay);
   }
}  // end class
