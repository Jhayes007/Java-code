/* 
   Filename: Bill.java
   Author: J.Hayes
   Date: Feb. 19, 2020
   Purpose: To demonstrate the structure of a Java class and how to create
            a user-defined class.
   */

import java.util.Scanner;

public class Bill
{
   public static double RATE = 150.00; // Dollars for 15 minutes
   
   // Fields --- Attributes
   // These are instance fields and will be there in every object of the class
   private int hours;
   private int minutes;
   private double fee;
   
   // Methods
   // These are instance methods and will be there for every object of the class
   public void inputTimeWorked()
   {
      System.out.println("Enter the number of full hours worked ");
      System.out.println("followed by number of minutes: ");
      Scanner keyboard = new Scanner(System.in);
      hours = keyboard.nextInt();
      minutes = keyboard.nextInt();
   }  // end inputTimeWorked()
   
   public double computeFee(int hoursWorked, int minutesWorked)
   {
      minutesWorked = hoursWorked * 60 + minutesWorked;
      int quarterHours = minutesWorked / 15; // Fractions of a quarter hour
            // are not charged.
      return quarterHours * RATE;
   }  // end computeFee()
   
   public void updateFee()
   {
      fee = computeFee(hours, minutes);
   }  // end updateFee()
   
   public void outputBill()
   {
      System.out.println("Time worked: ");
      System.out.println(hours + " hours and " + minutes + " minutes.");
      System.out.println("Rate: $" + RATE + " per quarter hour.");
      System.out.println("Amount due: $" + fee);
   }  // end outputBill()
   
}  // end class

