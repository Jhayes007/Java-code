/* 
   Filename: HellowWorld.java
   Author: J.Hayes
   Date: Jan. 13, 2020
   Purpose: To demonstrate the strcuture of a java program and how to create 
            java statements and output strings.
               
*/

// This is an example of a single-line comment or an end-of-line comment.

public class HelloWorld
{
   public static void main(String[] args)
   {
      System.out.println("Hello world!"); // This is a println statement
      System.out.print("Programming ");
      System.out.print("is fun\n");
      
      int numStudents = 28;   // Declaration and intialization of a variable
      
      System.out.println("The number of students is " + numStudents);   // must concatenate to run
      System.out.printf("The number of students is %3d" , numStudents); // way to avoid concatenation 
      
   } // end main()

}  // end class