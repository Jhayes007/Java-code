/* 
   Filename: ForLoop.java
   Author: J.Hayes
   Date: Feb. 3, 2020
   Purpose: To demonstrate the use of the for loop in java. This is the java version 
               of the speed converter program we did originally in Logic using Python.  
*/



public class ForLoop
{
   public static void main(String[] args)
   {
      // Constants 
      final int STARTINGKPH = 60;
      final int MAXKPH = 130;
      final int INCREMENT = 10;
      
      // Variables
      int kph;
      double mph;
      
      // Display the table headings
      System.out.println("KPH\t\tMPH");
      System.out.println("------------------");
      
      // Display the speeds in a table
      for (kph = STARTINGKPH; kph < MAXKPH; kph += INCREMENT)
      {  
         // Calculate the mph
         mph = kph * 0.6214;
         // Display the speeds
         System.out.printf("%d\t\t%.1f%n
      }  // end for
   }  // end main()
}  // end class