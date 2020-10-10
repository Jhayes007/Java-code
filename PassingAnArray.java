/* 
   Filename: PassingAnArray.java
   Author: J.Hayes
   Date: Mar. 02, 2020
   Purpose: To demonstrate how to pass individual elements of an array
               and a complete array to a method in Java.        
*/

import java.util.Scanner;

public class PassingAnArray
{
   public static void main(String[] args)
   {
      final int SIZE = 5;
      
      // Create an int array
      int[] nums = new int[SIZE];
      
      // Get the values into the array
      getValues(nums);
      
      // Pass the array elements to showValues() method; passing individual elements
      System.out.println("Using the method showValues(): ");
      for (int index = 0; index < SIZE; index++)
         showValue(nums[index]);
      System.out.println();
      
      System.out.println("Using the method showArray(): ");
      showArray(nums);  // Passing a complete array
   }  // end main()
   
   /**
      The getValues() method. To read numbers into the array.
      @param arry The array that is passed to the method.
   */
   private static void getValues(int[] arr)
   {
      // Scanner object to read in the values
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a series of " + arr.length + " elements.");
      // Read the values into the array
      for (int index = 0;  index < arr.length; index++)
      {
         System.out.print("Enter number " + (index + 1) + ": ");
         arr[index] = keyboard.nextInt();
      }  // end for
   }  // end getValues()
   
   /** 
      The showValues() method. This is the method to which individula array
      elements are passed.
      @param n Individual array element
   */
   public static void showValue(int n)
   {
      System.out.print(n + "    ");
   }  // end showValue()
   
   /** 
      The showArray() method. The complete array is passed to this method.
      @param arr The complete array passed to the method.
   */
   public static void showArray(int[] arr)
   {
      // Display the array elements
      for (int val : arr)
         System.out.print(val + "    ");
   }  // end showArray()
}  // end class 