/* 
   Filename: ArrayInitialization.java
   Author: J.Hayes
   Date: Feb. 26, 2020
   Purpose: To demonstrate how to create an array in Java. 
            This program will initialize the array, assign references
            to the same array, make a copy of the array, and illustrate
            how to use the enchanced for loop.            
*/

public class ArrayInitialization
{
   public static void main(String[] args)
   {
      int[] array1 = {2, 4, 6, 8, 10}; // Array initialization
      int[] array2 = new int[5]; // An unassigned array reference
      int[] array3 = array1;  // A reference initialized to array1
      int array4[] = new int[7]; // An initialization of an array similar to C++
      
      // Copy array1 to array2 element-by-element
      for (int i = 0; i < array1.length; i++)
      array2[i] = array1[i];
      
      // Change one of the elements of array1
      array1[0] = 200;
      // Change one of the elements of array3
      array3[4] = 1000;
      
      // Display all the elements of array1
      System.out.println("The contents of array1: ");
      for (int value : array1) // An enhanced for loop
         System.out.print(value + "    ");
         System.out.println();
         
          // Display all the elements of array2
      System.out.println("The contents of array2: ");
      for (int value : array2) // An enhanced for loop
         System.out.print(value + "    ");
         System.out.println();
         
          // Display all the elements of array3
      System.out.println("The contents of array3: ");
      for (int value : array3) // An enhanced for loop
         System.out.print(value + "    ");
         System.out.println();
   }  // end main()
}  // end class
