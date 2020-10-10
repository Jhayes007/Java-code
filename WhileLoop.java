/* 
   Filename: WhileLoop.java
   Author: J.Hayes
   Date: Feb. 3, 2020
   Purpose: To demonstrate the use of the while loop in java. Here the while loop is being used as a conditional loop.           
*/
import java.util.Scanner;

public class WhileLoop
{
   public static void main(String[] args)
   {
      final double MAXTEMP = 102.5;  // Max temperature
      double temperature;
      
      Scanner keyboard = new Scanner(System.in);
      
      // Get the current temperature
      System.out.print("Enter the substance's temperature: ");
      temperature = keyboard.nextDouble();
      
      // As long as necessary, instruct the techinician to adjust the temperature
      while (temperature > MAXTEMP)
      {
         System.out.println("The temperaute is too high. Turn the ");
         System.out.println("thermostat down and wait for 5 minutes.");
         System.out.println("Then, take the temperature again and enter it here: ");
         temperature = keyboard.nextDouble();
      } // end while
      
      // Remind the technician to check the temperature again in 15 minutes.
      System.out.println("The temperature is acceptable.");
      System.out.println("Check it again in 15 minutes.");
   }  // end main()
}  // end class
