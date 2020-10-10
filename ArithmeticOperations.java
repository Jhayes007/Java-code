/* 
   Filename: ArithmeticOperations.java
   Author: J.Hayes
   Date: Jan. 13, 2020
   Purpose: To demonstrate some of the different arithmetic operations in java.               
*/

public class ArithmeticOperations
{
   public static void main(String[] args)
   {
   
      double regularWages; // To hold calculated regular wages
      double basePay = 30; // Base pay rate
      double regularHours = 40;  // Regular hours worked
      double overtimeWages;   // overtime wages
      double overtimePay = 45.0; // overtime pay
      double overtimeHours = 10; // overtime worked
      double totalWages;   // Total wages
      
      regularWages = basePay * regularHours;
      overtimeWages = overtimePay * overtimeHours;
      totalWages = regularWages + overtimeWages;
      System.out.println("Wages for the week are $" + totalWages);
      }  // end main() 
}  // end class

