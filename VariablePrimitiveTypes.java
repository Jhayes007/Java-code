/* 
   Filename: VariablePrimitiveTypes.java
   Author: J.Hayes
   Date: Jan. 15, 2020
   Purpose: To demonstrate the different primitive data types in java.               
*/

public class VariablePrimitiveTypes
{
   public static void main(String[] args)
   {
      // Integer types
      // Declarations
      int checking;  // Declare an int named checking
      byte miles;    // Declare a byte named miles
      short minutes;  // Declare a short int named minutes
      long days;     // Declare a long int named days
      
      checking = -20;   // Assignment statement
      miles = 105;
      minutes = 120;
      days = 185000;
      System.out.println(" We have made a journey of " + miles + " miles.");
      System.out.println(" It took " + minutes + " minutes.");
      System.out.println(" My account has $" + checking);
      System.out.println(" They say that about " + days + " days ago Columbus stood in this spot.");
      
      // Floating-point types
      double price, tax, total;  // Declare three variables as a list
      
      price = 29.75;
      tax = 1.76;
      total = 31.51;
      
      System.out.println();
      System.out.println(" The price of the item is " + price);
      System.out.println(" The tax is " + tax);
      System.out.println(" The total is " + total);
      
      // Java recognizes scientific notation
      double mass = 1.989E30;
      
      System.out.println(" The mass of the sun is " + mass + " kilograms.");
      
      // the char type
      char letterC, letterN;
      
      letterC = 'B';
      letterN = 67;
      System.out.println(" The value in letterC = " + letterC);
      System.out.println(" The value in letterN = " + letterN);
      
      
   }  // end main()
}  // end class
