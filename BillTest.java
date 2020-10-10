/* 
   Filename: BillTest.java
   Author: J.Hayes
   Date: Feb. 19, 2020
   Purpose: To demonstrate the structure of a Java class and how to create
            a user-defined class. This class will use the Bill class
*/

public class BillTest
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to the Consulting Office of ");
      System.out.println("          J. Hayes             ");
      // Instantiation of a class, we are creating an instance of the class
      Bill yourBill = new Bill();
      
      // yourBIll.hours = 10; // Cannot be accessed outside the class *Private*
      yourBill.RATE = 20.00;  // Can be accsesed as it's public
      yourBill.inputTimeWorked();
      yourBill.updateFee();
      yourBill.outputBill();
      System.out.println("\nIt has been a pleasure serving you.\n");
   }  // end main()
}  // end class