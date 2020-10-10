/*
   Filename: ObjectDeserialization.java
   Author: J. Hayes
   Date: Aug. 27, 2020
   Purpose: To demonstrate how to read an object from a file.
   */
   
   import java.io.*;
   
   public class ObjectDeserialization
   {
   static void getBalance()
   {
   }
      
      public static void main(String[] args) throws IOException
      {
         double balance;
         final int NUMITEMS = 3;
         
         // Create the stream objects
         FileInputStream inStream = new FileInputStream("SObjects.dat");
         ObjectInputStream objInputStream = new ObjectInputStream(inStream);
         
         // Accounts array
         BankAccount[] accounts = new BankAccount[NUMITEMS];
         
         // Reading the serialized objects from the file
         for (int i = 0; i < accounts.length; i++)
         {
            accounts[i] = (BankAccount)objInputStream.readObject();
         }  // end for
         
         // Close the file
         objInputStream.close();
         
         // Display the objects
         for (int i = 0; i < accounts.length; i++)
            System.out.println("Account " + (i + 1) + " $ "  + accounts[i].getBalance());
      }  // end main()
   }  // end class