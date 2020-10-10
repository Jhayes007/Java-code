/*
   Filename: WriteRandomFile.java
   Author: J. Hayes
   Date: Aug. 25, 2020
   Purpose: To demonstrate how to write to a random access file
   */
   
   import java.io.*;
   
   public class WriteRandomFile
   {
      public static void main(String[] args) throws IOException
      {
         
         // The letters array of characters
         char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                     'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                     
         System.out.println("Opening the file.");
         
         RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "rw");
         
         System.out.println("Writing data to the file ... ");
         
         // Sequentially write the letters array to the file
         for (int i = 0; i < letters.length; i++)
            randomFile.writeChar(letters[i]);
            
            // Close the file
            randomFile.close();
            
            System.out.println("Done.");
            }  // end main()
         }  // end class   
            