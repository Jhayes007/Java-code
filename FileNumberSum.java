/* 
   Filename: FileNumberSum.java
   Author: J.Hayes
   Date: Feb. 12, 2020
   Purpose: To demonstrate how to read from a sequential text file in java.
            In this example we will read numbers and add them.
*/

import java.util.Scanner;
import java.io.*;

public class FileNumberSum
{  
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0; // Accumulator   
      
      // Open the file for reading
      File file = new File("numbers.txt");
      // Make sure that the file exists
      if (!file.exists())
      {
         System.out.println("The file numbers.txt was not found.");
         System.exit(0);
      }  // end if
      
      Scanner inFile = new Scanner(file);
      
      // Read all the numbers in the file
      while (inFile.hasNext())
      {
         // Read from the file
         double number = inFile.nextDouble();
         System.out.print(number + "   ");
         // Add to the accumulator
         sum += number;
      }  // end while
      
      System.out.println();
      
      // close the file
      inFile.close();
      
      // Display the sum of the numbers
      System.out.println("The sum of the numbers in the file is " + sum);
      
   }  // end main()

}  // end class
