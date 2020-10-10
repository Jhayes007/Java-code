/* Filename: NotALambda01.java
   Author: J. Hayes
   Date: Sep. 01, 2020
   Purpose: To demonstrate the use of run() method. There is no lambda expression in this
               example, but it will be converted to a lambda expression in a later example.
*/

class OldStyle implements Runnable
{
   public void run()
   {
      System.out.println("Running in a class!");
   }  // end run()
}  // end class

public class NotALambda01
{
   public static void main(String[] args)
   {
      OldStyle r0 = new OldStyle();
      r0.run();
   }  // end main()
}  // end class()