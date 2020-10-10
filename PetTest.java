/* 
   Filename: PetTest.java
   Author: J.Hayes
   Date: Feb. 26, 2020
   Purpose: To demonstrate the structure of a Java class and how to create
            a user-defined class. This class has overloaded constructors
*/

import java.util.Scanner;

public class PetTest
{
   public static void main(String[] args)
   {
      Pet usersPet = new Pet("Jane Doe");
      
      System.out.println("My records on your pet are incomplete.");
      System.out.println("Here is what it currently says: ");
      System.out.println(usersPet);
      // The above statement is equivalent to :
      System.out.println(usersPet.toString());
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please enter the pet's name: ");
      String name = keyboard.nextLine();
      System.out.print("Please enter the pet's age: ");
      int age = keyboard.nextInt();
      System.out.print("Please enter the pet's weight: ");
      double weight = keyboard.nextDouble();
      // Set the pet's name, age, and weight
      usersPet.set(name, age, weight);
      
      System.out.println("My records now say: ");
      System.out.println(usersPet);
      // To get indivdual fields use the get methods
      System.out.println("The age of the pet is: " + usersPet.getAge());
   }  // end main()
}  // end class