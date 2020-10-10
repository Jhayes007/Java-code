/* 
   Filename: FileReadExample.java
   Author: J.Hayes
   Date: Feb. 5, 2020
   Purpose: To demonstrate how to read to a sequential text file in java.
*/

import java.util.Scanner;
import java.io.*;

public class FileReadExample
{
   public static void main(String[] args) throws IOException
   {
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Get the file
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();
      
      
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      // Read lines from the file until the end
      while (inFile.hasNext())
      {
         // Read the name
         String personName = inFile.nextLine();
         // Display the string
         System.out.println(personName);
      }  // end while
      
      // Close the file
      inFile.close();
   }  // end main()
}  // end class

