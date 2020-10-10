/* 
   Filename: PassingArgumentsByVal.java
   Author: J.Hayes
   Date: Feb. 17, 2020
   Purpose: To demonstrate how to create and use a module/method in Java.
            Technically in java all arguments are passed by value.
            In this example the method we will be passing are integers and strings
*/

public class PassingArgumentsByVal
{
   public static void main(String[] args)
   {
      int num = 99;
      String name = "Lawrence Durrell";
      
      // Display the values in these varaibles
      System.out.println("In main(): The value of num = " + num);
      System.out.println("In main(): The value of name = " + name);
      
      // Call the two change...() methods
      changeMe(num);
      changeName(name);
      
      // Display the value after the calls
      System.out.println("After the changeMe() call: num = " + num);
      System.out.println("After the changeName() call: name = " + name);
   }  // end main
   
   public static void changeMe(int myValue)
   {
      
      System.out.println("In changeMe(): I am changing the value.");
      // Change value of the parameter
      myValue = 10;
      // Display the value of myValue
      System.out.println("Now the value of myValue = " + myValue);
   }  // end changeMe()
   
   public static void changeName(String str)
   {  
      // Create a string object containing a name
      str = "Charles Dickens";
      // Display the String referenced by str
      System.out.println("In changeName(): the name is now " + str);
   }  // end changeName
}  // end class
