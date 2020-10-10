/* 
   Filename: SimpleMethod.java
   Author: J.Hayes
   Date: Feb. 12, 2020
   Purpose: To demonstrate how to create and use a module/method in Java.
*/

public class SimpleMethod
{
   public static void main(String[] args)
   {
      System.out.println("Hello from the main() method.");
      for (int i = 0; i < 5; i++)
      {
         displayMessage(); // method call
      }  // end for
      System.out.println("Back in the main() method.");
   }  // end main()
   
   // The displayMessage() method
   public static void displayMessage()
   {
      System.out.println("Hello from the displayMessage() method.");
   }  // end displayMessage()
}  // end class