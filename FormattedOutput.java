/* 
   Filename: FormattedOutput.java
   Author: J.Hayes
   Date: Jan. 29, 2020
   Purpose: To demonstrate how to format output in java.            
*/

import javax.swing.JOptionPane;

public class FormattedOutput
{
   public static void main(String[] args)
   {
      int num1 = 123;
      int num2 = 12;
      int num3 = 45678;
      int num4 = 456;
      int num5 = 1234567;
      int num6 = 1234;
      
      double num7 = 127.899;
      double num8 = 3456.148;
      double num9 = 3.776;
      double num10 = 264.821;
      double num11 = 88.081;
      double num12 = 1799.999;
      
      // Display the ints in fields of 8 characters
      System.out.printf("%8d %8d\n", num1, num2);
      System.out.printf("%8d %-8d\n", num3, num4);
      System.out.printf("%-8d %-8d\n", num5, num6);
      
      // Display the doubles in fields of 9 characters with 2 decimal places
      System.out.printf("%9.2f\n", num7);
      System.out.printf("%9.2f\n", num8);
      System.out.printf("%9.2f\n", num9);
      System.out.printf("%9.2f\n", num10);
      System.out.printf("%9.2f\n", num11);
      System.out.printf("%9.2f\n", num12);
      
      // The syntax for the formatting string is as follows:
      //    %[Flags][field width][.precision]conversion
      
      // Format for currency
      System.out.printf("num8*1000 formatted for currency = $%,.2f\n", num8*1000);
      // Display in a message box
      String output = String.format("num8*1000 formatted for currency = $%,.2f\n", 
         num8*1000);
      JOptionPane.showMessageDialog(null, output);
      
      // To place leading zeros in floats
      System.out.printf("%09.3f\n", num11);s

   }  // end main()
}  // end class