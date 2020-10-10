/* Filename: NotALambda02.java
   Author: J. Hayes
   Date: Sep. 01, 2020
   Purpose: To demonstrate the use of run() method in an inner class. There is no lambda expression in this
               example, but it will be converted to a lambda expression in a later example.
*/

public class NotALambda02
{
   public static void main(String[] args)
   {
      Runnable r =
         new Runnable()
         {
            public void run()
            {
               System.out.println("I'm in an anonymous inner class!");
            }  // end run()
         }; // end anonymous inner class
         
         r.run();
   }  // end main()
}  // end class