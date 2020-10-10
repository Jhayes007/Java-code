/* 
Filename: ArraySequentialSearch.java
Author: J.Hayes
Date: Mar. 09, 2020
Purpose: To demonstrate how to search arrays sequentially.
       */

public class ArraySequentialSearch
{
   public static void main(String[] args)
   {
      int[] tests = {87, 75, 98, 100, 82, 45, 79, 95, 67, 89};
      int results;
      
      // Search the array for the value 100
      results = sequentialSearch(tests, 100);
      
      // Determine whether 100 was found and display an appropiate message
      if (results == -1)
         System.out.println("You did not earn 100 on any test.");
      else
         System.out.println("You earned 100 on the test " + (results + 1));
   }  // end main()
   
   /**
      The sequentialSearch() method. This method searches an array for a value.
      @param arr The array to be searched
      @param val The value to search for
      @return The subscript of the value if found in the array, otherwise -1.
   */
   public static int sequentialSearch(int[] arr, int val)
   {
      int index;  // Loop control variable
      int element;   // Element the value is found at
      boolean found; // Flag indicating the value was found
      
      index = 0;
      element = -1;
      found = false;
      
      // Search
      while (!found && index < arr.length)
      {
         if (arr[index] == val)
         {
            found = true;
            element = index;
         }  // end if
         index++;
      }  // end while
      
      return element;
   }  // end sequentialSearch()   
}  // end class