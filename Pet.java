/* 
   Filename: Pet.java
   Author: J.Hayes
   Date: Feb. 19, 2020
   Purpose: To demonstrate the structure of a Java class and how to create
            a user-defined class. This class has overloaded constructors
*/


public class Pet
{
   // Instance fields
   private String name;
   private int age;  // in years
   private double weight;  // in pounds
   
   // Constructors
   // Default constructor  --- in Java also called the no-arg constructor
   public Pet()
   {  
      name = "No name yet.";
      age = 0;
      weight = 0;
   }  // end constructor
   
   // Constructors with one argument
   public Pet(String initialName)
   {
      // constructors normally set all instance variables/fields, even if there is
      // not a full set of parameters/values available.
      name = initialName;
      age = 0;
      weight = 0;
   }  // end constructor
   
   public Pet(int initialAge)
   {
      name = "No name yet.";
      weight = 0;
      if (initialAge < 0)
      {
         System.out.println("Error: Negative age.");
         System.exit(0);
      }
      else
      age  = initialAge;
   }  // end constructor
   
   public Pet(double initialWeight)
   {
      name = "No name yet.";
      age = 0;
      if (initialWeight < 0)
      {
         System.out.println("Error: Negative weight.");
         System.exit(0);
      }
      else
         weight = initialWeight;
   }  // end constructor
   
   
   // Constructor with 3-args
   public Pet(String initialName, int initialAge, double initialWeight)
   {
      name = initialName;
      if ((initialAge < 0) || (initialWeight < 0))
   {
      System.out.println("Error: Negative age or weight.");
      System.exit(0);
   }
   else
   {
   age = initialAge;
   weight = initialWeight;
   }  // end if-else
  } // end constructor
  
  
  // Set Methods --- also called mutators
  public void set(String initialName, int initialAge, double initialWeight)
  {

      name = initialName;
      if ((initialAge < 0) || (initialWeight < 0))
   {
      System.out.println("Error: Negative age or weight.");
      System.exit(0);
   }
   else
   {
   age = initialAge;
   weight = initialWeight;
  }   // end set(,,)
  }
  
  public void setName(String newName)
  {
   name = newName;
  }   // end setName()
  
  public void setAge(int newAge)
  {
    if (newAge < 0)
      {
         System.out.println("Error: Negative age.");
         System.exit(0);
      }
      else
      age  = newAge;
  }   // end newAge()
  
  public void setWeight(double newWeight)
  {
    if (newWeight < 0)
      {
         System.out.println("Error: Negative weight.");
         System.exit(0);
      }
      else
         weight = newWeight;
  }   // end setWeight()
  
  // Get Methods --- also called accessors
  public String getName()
  {
      return name;
  }   // end getName()
  
  public int getAge()
  {
      return age;
  }   // end getAge
  
  public double getWeight()
  {   
      return weight;
  }   // end getWeight()
  
  public String toString()
  {
      // This method provides the string representation of the class
      return ("Name: " + name + " Age: " + age + " years" + "\nWeight: " +
               weight + " pounds.");
  }   // end toString()
}  // end class
