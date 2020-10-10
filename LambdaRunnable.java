/* Filename: LambdaRunnable.java
   Author: J. Hayes
   Date: Sep. 01, 2020
   Purpose: To demonstrate the use of a lambda expression to replace an inner class.
*/

public class LambdaRunnable
{
   public static void main(String[] args)
   {
      Runnable r = 
         () -> System.out.println("In a lambda expression!");  // End of lambda expression
      r.run();
   }  // end main()
}  // end class

