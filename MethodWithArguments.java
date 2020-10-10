/* 
   Filename: MethodWithArguments.java
   Author: J.Hayes
   Date: Feb. 17, 2020
   Purpose: To demonstrate how to create and use a module/method in Java.
            In this example the method will we create is named "maximum" and
            will have three arguments.
*/

import java.util.Scanner;


public class MethodWithArguments
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      // Prompt for an input of three floating-point numbers
      System.out.print("Enter three floating-point values separated by spaces: ");
      double num1 = input.nextDouble();   // Read 1st number
      double num2 = input.nextDouble();   // 2nd number
      double num3 = input.nextDouble();   // 3rd number
      
      // Determine the maximum value
      double result = maximum(num1, num2, num3);   // Call the maximum() method
      
      // Display the maximum value
      System.out.println("The maximum value is: " + result);
  }  // end main
   
   /**
      The maximum() method. It takes three floating-point arguments and returns the 
      highest value of the three.
      
      @param n1 the first argument
      @param n2 the second argument
      @param n3 the third argument
      @retrun maxValue the highest of the three values passed to the method.
   */
   
      public static double maximum(double n1, double n2, double n3)
      {
         double maxValue = n1;   // Assume the largest is n1
         
         // Determine whether n2 is greater than maxValue
         if (n2 > maxValue)   {
            maxValue = n2;
            }  // end if
           // Determine if n3 is greater than maxValue
           if (n3 > maxValue) {
           maxValue = n3;
           }   // end if
           
           return maxValue;
      }  // end maximum()
        
}  // end class
