/*
   Filename: LambdaDemo.java
   Author: J. Hayes
   Date: Aug. 27, 2020
   Purpose: To demonstrateythe use of a lambda expression.         
*/

   import java.util.Scanner;
   
   public class LambdaDemo
   {
      public static void main(String[] args)
      {
         int num;
         
         Scanner keyboard = new Scanner(System.in);
         // create an object that implements the functional interface IntCalculator
         IntCalculator square = X -> X * X;
         // Get a number from the user
         System.out.print("Enter an integer number: ");
         num = keyboard.nextInt();
         // Display the square of the number
         System.out.println("The square is " + square.calculate(num));
      }  // end main()
   }  // end class
   