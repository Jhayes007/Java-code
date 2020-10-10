/* 
Filename: StringArrays.java
Author: J.Hayes
Date: Mar. 04, 2020
Purpose: To demonstrate how strings can be stored in arrays.
    */

public class StringArrays
{
   public static void main(String[] args)
   {
      String[] months = {"January", "February", "March", "April", "May", "June",
               "July", "August", "September", "October", "November", "December"};
      int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
      for (int i = 0; i < months.length; i++)
         System.out.println(months[i] + " has " + days[i] + " days.");
         
         for (int i = 0; i < months.length; i++)
            System.out.println(months[i] + " has " + months[i].length() + " characters.");
   }  // end main()
}  // end class