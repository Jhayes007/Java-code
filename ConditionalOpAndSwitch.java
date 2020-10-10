/* 
   Filename: ConditionalOpAndSwitch.java
   Author: J.Hayes
   Date: Jan. 29, 2020
   Purpose: To demonstrate how the conditional operator functions 
            and also the switch statement in java.            
*/

import java.util.Scanner;

public class ConditionalOpAndSwitch
{
   public static void main(String[] args)
   {
      // The conditional operator (condition ? true : false)
      int x = 10, y;
      
      y = (x > 0) ? 5 : -5;
      System.out.println("The value of y = " + y);
      // The above statement is equivalent to the following if statement
      if (x > 0)
      y = 5;
      else
      y = -5;
      System.out.println("The value of y (in if) = " + y);
      
      // The switch statement
      String input;
      char foodGrade;   // Grade of pet food
      
      // Get user input
      Scanner keyboard = new Scanner(System.in);
      // Prompt for food grade
      System.out.println("Pet food is available in three grades: ");
      System.out.println("A, B, C. Which one do you want the price for? ");
      input = keyboard.nextLine();
      foodGrade = input.charAt(0);
      
      // Display the price
      switch (foodGrade)
      {
         case 'A':
         case 'a':
         System.out.println("30 cents per pound.");
            break;
         case 'B':
         case 'b':
         System.out.println("20 cents per pound.");
            break;
         case 'C':
         case 'c':
         System.out.println("10 cents per pound.");
            break;
         default: 
         System.out.println("Invalid choice!");
      }  // end switch
      
   }  // end main()
}  // end class
