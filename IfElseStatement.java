/* 
   Filename: IfElseStatement.java
   Author: J.Hayes
   Date: Jan. 27, 2020
   Purpose: To demonstrate a If-else statement in java.            
*/

import java.util.Scanner;

public class IfElseStatement
{
   public static void main(String[] args)   
   {
      double num, den;  // Operands for division
      double quotient;  // Result of division
      // Create a scanner object to read input
      Scanner keyboard = new Scanner(System.in);
      
      // Read the numerator and the denominator
      System.out.print("Enter the numerator: ");
      num = keyboard.nextDouble();
      System.out.print("Enter the denominator: ");
      den = keyboard.nextDouble();
      
      if (den == 0)
      {
         System.out.println("Division by zero is not possible.");
         System.out.println("Please run the program again and ");
         System.out.println("Enter a denominator other than zero.");
       }
       else
       {
         quotient = num / den;
         System.out.print("The quotient of " + num);
         System.out.print(" divided by " + den);
         System.out.println(" is " + quotient);
      }  // end if-else
   }  // end main
} // end class
