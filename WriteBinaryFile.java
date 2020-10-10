/*
   Filename: WriteBinaryFile.java
   Author: J. Hayes
   Date: Aug. 25, 2020
   Purpose: To demonstrate how to write binary files
   */
   
   import java.io.*;
   
   public class WriteBinaryFile
   {
      public static void main(String[] args) throws IOException
      {
         // Array to be written to the file
         int[] nums = {2, 4, 6, 8, 10, 12, 14};
         
         // Create the binary output objects
         FileOutputStream fstream = new FileOutputStream("numbers.dat");
         DataOutputStream outputFile = new DataOutputStream(fstream);
         
         System.out.println("Writing the numbers to the file ...");
         
         // Write the array elements to the file
         for (int i = 0; i < nums.length; i++)
            outputFile.writeInt(nums[i]);
            
         System.out.println("Done.");
         
         // Close the file
         outputFile.close();
      }  // end main()
   }  // end class