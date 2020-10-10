/* 
   Filename: InputOperations.java
   Author: J.Hayes
   Date: Jan. 22, 2020
   Purpose: To demonstrate the keyboard input operations.             
*/

import java.util.Scanner;

public class InputOperations
{
   public static void main(String[] args)
   {
      String name;      // To hold a name
      int hours;        // hours worked
      double payRate;   // pay rate
      double grossPay;  // Gross pay
      
      // Create a Scanner object to read input
      Scanner keyboard = new Scanner(System.in);
      
      // Get the user's name
      System.out.print("What is your name? ");  // prompt
      name = keyboard.nextLine();   // Method to read a string
      // Get the hours worked
      System.out.print("How many hours did you work? ");  // prompt
      hours = keyboard.nextInt();   // Method to read an integer
      // Get the pay rate
      System.out.print("What is your hourly pay rate? ");  // prompt
      payRate = keyboard.nextDouble();   // Method to read a double
      // Calculate the gross pay
      grossPay = hours * payRate;
      // Display the result
      System.out.println("\nHello " + name);
      System.out.println("Your gross pay is $" + grossPay);
      
      // Consume the remaining newline character from the keyboard buffer
      keyboard.nextLine();
      // Prompt for another name
      System.out.print("Enter another name: " );
      String name1 = keyboard.nextLine();
      
      System.out.println("Hi, " + name1);
      
      
   }  // end main()
}  // end class
