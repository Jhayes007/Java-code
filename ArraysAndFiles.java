/* 
Filename: ArraysAndFiles.java
Author: J.Hayes
Date: Mar. 04, 2020
Purpose: To demonstrate how arrays can be used in conjunction with files,
         writing and for reading
   */
   
  import java.io.*;
  import java.util.Scanner;

public class ArraysAndFiles
{
public static void main(String[] args) throws IOException
{
   final int SIZE = 10;
   int[] numbers = {10, 20, 30, 40, 50};

  String filename = "values.txt";   
   
   /*
   // WRITING 
   // Open file for writing
   PrintWriter outFile = new PrintWriter(filename);
   // Write the numbers array to the file.
   for (int i = 0; i < numbers.length; i++)
      outFile.println(numbers[i]);
   outFile.close();  
   */
   // READING
   File file = new File(filename);
   Scanner inFile = new Scanner(file); // Open the file for reading
   
   int i = 0;
   int[] nums = new int[SIZE];
   while (inFile.hasNext() && i < nums.length)
   {
      nums[i] = inFile.nextInt();   // Store the read numbers in nums array
      i++;
   }  // end while
   
   // Display the numbers
   for (int val : nums)
   System.out.print(val + "  ");
   }  // end main()
}  // end class