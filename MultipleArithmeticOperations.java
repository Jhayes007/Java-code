/* 
   Filename: MultipleArithmeticOps.java
   Author: J.Hayes
   Date: Jan. 15, 2020
   Purpose: To demonstrate the different arithmetic operations in java.               
*/

public class MultipleArithmeticOperations
{
   public static void main(String[] args)
   {
      // floating-point numbers
      double x = 10.0, y = 20.0, z = 30.0;
      
      // Arithmetic Ops
      System.out.println("The sum of x and y = " + (x + y ));
      System.out.println("the difference of z and x = " + (z - x));
      System.out.println("The product of y and z = " + (y * z));
      System.out.println("the result of dividing y by x = " + (y / x));
      
      // Integer numbers
      // Trying to access ix
      // System.out.println("The value of ix = " + ix);
      
      // Declarations
      int ix = 5, iy = 17, iz = 23;
      
      // Date: Jan. 22, 2020
      System.out.println("\nThe sum of ix and iy = " + (ix + iy ));
      System.out.println("the difference of iz and ix = " + (iz - ix));
      System.out.println("The product of iy and iz = " + (iy * iz));
      System.out.println("the result of dividing iy by ix = " + (iy / ix));
      System.out.println("The remainder from ix divided by iy = " + (iy % ix));
      System.out.println("Regular division with integers: " + ((double) iy / ix));

      ix += iy; // Equivalent to: ix - ix + iy;
      iz -= ix; // Same as iz = iz -ix;
      iy *= ix; // Same as iy = iy + ix;
      System.out.println("\nThe new value of ix = " + ix);
      System.out.println("The new value of iy = " + iy);
      System.out.println("The new value of iz = " + iz);
   }  // end main()
   
}  // end class