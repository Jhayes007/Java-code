/* 
Filename: GradeBook.java
Author: J.Hayes
Date: Mar. 09, 2020
Purpose: To demonstrate how two-dimensional arrays are used in Java.
         also , how they can be returned from methods and some common methods on arrays.
       */
       
public class GradeBook
{
   // instance fields
   private String courseName; // Name of the course
   private int grades[][]; // 2-D array of student grades
   
   // 2-arg constructor to initialize courseName and grades array
   public GradeBook(String name, int gradesArr[][])
   {
      courseName = name;
      grades = gradesArr;
   }  // end constructor
   
   // Method to set courseName
   public void setCourseName(String name)
   {
      courseName = name;
   }  // end setCourseName()
   
   // Get method for courseName
   public String getCourseName()
   {
      return courseName;
   }  // end courseName()
   
   // Welcome message to the user GradeBook user
   public void displayMessage()
   {
      System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
   }  // end displayMessage()
   
   // Process the data
   public void processData()
   {
      // Output the grades array
      outputGrades();
      // Call methods to find minimum and maximum grades
      System.out.printf("n%s %d%n%s %d%n%n", "Lowest grade in the grade book is ",
      getMinimum(), "Highest grade in the grade book is ", getMaximum());
      // Output grade distribution chart of all grades on all tests
      outputBarChart();
   }  // end processData()
   
   // Find the minimum grade
   public int getMinimum()
   {
      // Assume the first element of the grades array is the smallest
      int lowGrade = grades[0][0];
      // Loop thru row of grades
      for (int studentGrades : grades)
      {
         // Loop thru columns of the current row
         for (int grade : studentGrades)
         {
            // if grade < lowGrade, assign it to lowGrade
            if (grade < lowGrade)
               lowGrade = grade; // end if
         }  // end inner for
      }  // end outer for
      return lowGrade;  // return the lowest grade
   }  // end Minimum()
   
   // Find the maximum grade
   public int getMaximum()
   {
      // Assume the first element of the grades array is the largest
      int highGrade = grades[0][0];
      // Loop thru row of grades
      for (int studentGrades : grades)
      {
         // Loop thru columns of the current row
         for (int grade : studentGrades)
         {
            // if grade < lowGrade, assign it to highGrade
            if (grade < highGrade)
               highGrade = grade; // end if
         }  // end inner for
      }  // end outer for
      return highGrade;  // return the highest grade
   }  // end Maximum()
   
   // Determine the average grade for a particular student (or set of grades)
   public double getAverage(int setOfGrades[])
   {
      int total = 0; // Accumulator initialized
      
      // Sum the grades for a student
      for (int grade : setOfGrades)
         total += grade;
      return (double)total / setOfGrades.length;
   }  // end getAverage()
   
   // Output the contents of the grades array
   public void outputGrades()
   {
      System.out.println("The grades are: \n");
      System.out.println("                \n");
      // Create a column heading for each of the tests
      for (int test = 0; test < grades[0].length; test++)
         System.out.printf("Test %d ", test+1);
         
      // Create row/columns of text representing array grades
      for (int student = 0; student < grades.length; student++)
      {
         System.out.printf("Student %d", student+1);
         for (int test : grades[student]) // output student's grades
            System.out.printf("%8d", test);  // end inner for
         double average = getAverage(grades [student]);
         System.out.printf("%9.2f%n", average);   
      }  // end outer for
   }  // end outputGrades()
   
   // Output the bar chart displaying overall grade distribution
   public void outputBarChart()
   {
      System.out.println("Overall grade distribution: ");
      // Store frequency of grades in each range of 10 grades
      int frequency[] = new int[11];
      // For each grade in GradeBook, increment the appropiate frequency
      for (int studentGrades[] : grades)
      {
         for (int grade : studentGrades)
         ++frequency[grade/10];  // end inner for
      }  // end outer for
      
      // For each frequency, print bar in chart
      for (int count = 0; count < frequency.length; count++)
      {
         // Output bar label ("00-09: ", ..., "90-99: ". "100:  )
         if (count == 10)
         System.out.printf("%5d: ", 100);
         else
         System.out.printf("%02d-%02d: ", count*10, count*10+9);
         // Print bar of asterisks
         for (int stars = 0; stars < frequency[count]; stars++)
         System.out.print("*");
         
         System.out.println();   // Start a new line of output
      }  // end for
   }  // end outputBarChart()
}  // end class
