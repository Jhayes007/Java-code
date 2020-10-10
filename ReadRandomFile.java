/*
   Filename: ReadRandomFile.java
   Author: J. Hayes
   Date: Aug. 25, 2020
   Purpose: To demonstrate how to read from a random access file
   */
   
      import java.io.*;
      
  public class ReadRandomFile
  {
  
   public static void main(String[] args) throws IOException
   {
      final int CHARSIZE = 2;
      long byteNum;  // byte number
      char ch; // Hold a character read from the file
      
      // Open the file
      RandomAccessFile randomFile = new RandomAccessFile("Letters.dat", "r");
      
      ch = randomFile.readChar();
      System.out.println(ch);
      
      // Move to character 10. This is the 11th character from the beginning
      // of the file
         byteNum = CHARSIZE * 10;
         randomFile.seek(byteNum);  // Moving the file pointer
         ch = randomFile.readChar();
         System.out.print(ch);
         
         randomFile.seek(0);
         ch = randomFile.readChar();
         System.out.println(ch);
      
      
      // Close the file
      // randomFlle.close();
      }  // end main()
   }  // end class
