/* 
Filename: ArrayOfObjects.java
Author: J.Hayes
Date: Mar. 09, 2020
Purpose: To demonstrate how arrays of objects can be created and used. This class
         uses the BankAccount class. The array will consist of several Bank accounts.
       */
       
import java.util.Scanner;

public class ArrayOfObjects
{
   public static void main(String[] args)
   {
      final int NUMACCOUNTS = 4;    // Size of the array (number of accounts)
      
      // Create a reference to BankAccount object
      BankAccount[] accounts = new BankAccount[NUMACCOUNTS];
      // Create object of array
      createAccounts(accounts);
      // Display the balance of each account
      System.out.println("Here are the balances for each account: ");
      for (int i = 0; i < accounts.length; i++)
      System.out.println("Account " + (i+1) + ": $" + accounts[i].getBalance());
   }  // end main()
   
   /**
      createAccounts() method. This method creates a BankAccount object for each
      element of the array. The user is asked for each account's balance.
      @param arr The array to reference the accounts.
   */
   private static void createAccounts(BankAccount[] arr)
   {
      double balance;
      
      Scanner keyboard = new Scanner(System.in);
      
      // Create the accounts
      for (int i = 0; i < arr.length; i++)
      {
         // Get the account's balance
         System.out.print("Enter the balance for account " + (i+1) + ": ");
         balance = keyboard.nextDouble();
         
         // Create the account
         arr[i] = new BankAccount(balance);
      }  // end for
   }  // end createAccount()   
} // end class
    
