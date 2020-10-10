/* 
   Filename: StringOperations.java
   Author: J.Hayes
   Date: Jan. 22, 2020
   Purpose: To demonstrate some string operations.            
*/

public class StringOperations
{
   public static void main(String[] args)
   {
      String greeting = "Good morning, ";
      String name = "George";
      
      System.out.println(greeting + name);
      
      int stringSize;
      stringSize = greeting.length();
      System.out.println("The greeting variable has " + stringSize + " characters.");
      
      // Some String methods
      char letter;
      String upper, lower;
      lower = greeting.toLowerCase();
      upper = greeting.toUpperCase();
      letter = greeting.charAt(3);
      
      System.out.println("greeting in lowercase is " + lower);
      System.out.println("greeting in uppercase is " + upper);
      System.out.println("The character at subscript 3 is " + letter);
   }  // end main()
}  // end class
