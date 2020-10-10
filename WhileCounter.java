/* 
   Filename: WhileCounter.java
   Author: J.Hayes
   Date: Feb. 3, 2020
   Purpose: To demonstrate the use of the while loop in java. Here the while loop is being used as a counter loop.           
*/



public class WhileCounter
{
   public static void main(String[] args)
   {
      int counter = 1;  // Loop control variable
      
      while (counter <= 10)
      {
         System.out.printf("%d  ", counter);
         ++counter;
      }  // end while
      
      System.out.println();
   }  // end main()
}  // end class