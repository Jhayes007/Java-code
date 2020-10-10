/* 
   Filename: ReturningAnArray.java
   Author: J.Hayes
   Date: Mar. 02, 2020
   Purpose: To demonstrate returning  an array from a method in Java.  
   */

public class ReturningAnArray
{
   public static void main(String[] args)
   {
      double [] values;
      
      values = getValues();
      
      for (double val : values)
      System.out.print(val + "  ");
   }  // end main()
   
   /** 
      The getValues() method
      @return A reference to an array of doubles
      */
      public static double[] getValues()
      {
         double[] arr = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7};
         
         return arr;
      }  // end getValues()
}  // end class
