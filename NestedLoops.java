/* 
   Filename: NestedLoops.java
   Author: J.Hayes
   Date: Feb. 5, 2020
   Purpose: To demonstrate the use of nested loops in java. In this example
         we simulate a clock. 3 loops in action (hours, minutes, and seconds) that are nested inside one another.
*/

public class NestedLoops
{
   public static void main(String[] args)
   {
      // Simulation of a clock
      for (int hours = 1; hours <= 12; hours++)
      {
      for   (int minutes = 1; minutes <= 59; minutes++)
      {
         for (int seconds = 1; seconds <= 59; seconds++)
         {
            System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
         }  // end seconds loop
       }  // end minutes loop
     }  // end hours loop
   }  // end main()
}  // end class
