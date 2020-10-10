/* 
   Filename: FileWriteExample.java
   Author: J.Hayes
   Date: Feb. 5, 2020
   Purpose: To demonstrate how to write to a sequential text file in java.
*/

import java.util.Scanner;
import java.io.*;

public class FileWriteExample
{
   public static void main(String[] args) throws IOException
   {
      String filename;  // file name
      String personName;   // Name of a person
      int numPersons;   // Number of persons
      
      // Scanner objext for input
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of people
      System.out.print("How many people are there? ");
      numPersons = keyboard.nextInt();
      
      // Clear the buffer for string reading
      keyboard.nextLine();
      
      // Get the filename
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      
      // Open the file
      PrintWriter outFile = new PrintWriter(filename);
      
      // Get the data and write it to the file
      for (int i = 1; i <= numPersons; i++)
      {
         // Get a name
         System.out.print("Enter the name of a person " + i + ": ");
         personName = keyboard.nextLine();
         
         // Write the string to the file
         outFile.println(personName);
      }  // end for 
      
      // Close the file
      outFile.close();
      System.out.println("Data written to the file.");
   }  // end main()
}  // end class