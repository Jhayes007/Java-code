/* 
   Filename: DeepAndDeeper.java
   Author: J.Hayes
   Date: Feb. 17, 2020
   Purpose: To demonstrate how to create and use a module/method in Java.
           This example demonstrates layered method calls
*/

public class DeepAndDeeper
{
   public static void main(String[] args)
   {
      System.out.println("I am starting in main().");
      deep();
      System.out.println("Now I am back in main().");
   }  // end main
   
   // The deep() method
   public static void deep()
   {
      System.out.println("I am now in deep().");
      deeper();
      System.out.println("Now I am back in deep().");
   }  // end deep()
   
   // The deeper() method
   public static void deeper()
   {
      System.out.println("I am now in deeper().");
   }  // end deeper()
}  // end class
