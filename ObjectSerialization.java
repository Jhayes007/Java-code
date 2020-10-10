/*
   Filename: ObjectSerialization.java
   Author: J. Hayes
   Date: Aug. 27, 2020
   Purpose: To demonstrate how to write an object to a file.
   */
   
   import java.io.*;
   import java.util.Scanner;
   
   public class ObjectSerialization
   {
      public static void main(String[] args) throws IOException
      {
         double balance;
         final int NUMITEMS = 3;
         
         // Create a Scanner object for input
         Scanner input = new Scanner(System.in);
         // Create a bank account object
         BankAccount[] accounts = new BankAccount[NUMITEMS];
    
         // Populate the array
         for (int i = 0; i < accounts.length; i++)
         {
            System.out.print("Enter the balance for account " + (i + 1) + ": ");
            balance = input.nextDouble();
            
            // Create an object in the array
            accounts[i] = new BankAccount();
         }  // end for
         
         // Create the stream objects
         FileOutputStream outStream = new FileOutputStream("SObjects.dat");
         ObjectOutputStream objOutputFile = new ObjectOutputStream(outStream);
         // Write the serialized object to the file
         for (int i = 0; i < accounts.length; i++)
          //  objOutputFile.writeObject(accounts[i]);
            
         // Close the file
         objOutputFile.close();
         
         System.out.println("The serialized objects have been written to the file.");   
      }  // end main()
   }  // end class
