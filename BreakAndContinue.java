/* 
   Filename: BreakAndContinue.java
   Author: J.Hayes
   Date: Feb. 5, 2020
   Purpose: To demonstrate the use of break and continue statements in loops in java.
*/

import java.util.Scanner;

public class BreakAndContinue
{
   public static void main(String[] args)
   {
      int n;   // to hold user input
      
      Scanner keyboard = new Scanner(System.in);
      
      /* The following is an infinite loop. This is being used for demonstration
      purposes only. DO NOT USE IN PRACTICE. It is not generally needed except
      in some situations (ex: creating a server).
      In this example if the number entered is even, the loop will skip
      the statements after the even number test and go to the next iteration.
      If the number is divisible by 3 it will break out of the loop.
      */
      
      for (;;) // An infinite for loop
      {
         System.out.print("Enter an integer: ");
         n = keyboard.nextInt();
         
         if (n % 2 == 0)
         continue;
         if (n % 3 == 0)
         break;
         System.out.println("Bottom of the loop.");
      }  // end for
      
      System.out.println("Outside of the loop.");
   }  // end main()
}  // end class
