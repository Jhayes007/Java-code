/*
   Filename: ReadBinaryFile.java
   Author: J. Hayes
   Date: Aug. 25, 2020
   Purpose: To demonstrate how to read binary files
   */
   
   import java.io.*;

public class ReadBinaryFile
{
   public static void main(String[] args) throws IOException
   {
      int num; // Read a number from the file
      boolean endOfFile = false;
      
      // Create the binary file objects
      FileInputStream fstream = new FileInputStream("numbers.dat");
      DataInputStream inputFile = new DataInputStream(fstream);
      
      System.out.println("Reading numbers from the file: ");
      
      // Read the contents of the file
      while (!endOfFile)
      {
         try
         {
            num = inputFile.readInt();
            System.out.print(num + " ");
         }
         catch (EOFException ex)
         {
            endOfFile = true;
         }  // end try/catch block
      }  // end while
      
      System.out.println("\nDone.");
      
      // Close the file
      inputFile.close();  
   }  // end main()
}  // end class