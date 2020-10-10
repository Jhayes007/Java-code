/* 
   Filename: StringComparisons.java
   Author: J.Hayes
   Date: Jan. 29, 2020
   Purpose: To demonstrate how to compare strings in java.            
*/

public class StringComparisons
{
   public static void main(String[] args)
   {
      String name1 = "Mark", name2 = "Mark", name3 = "Mary";
      
      //    USING RELATIONAL OPERATORS:   // Don't use, because the addresses are different i.e. reference variables
      if (name1 == name2)
         System.out.println(name1 + " and " + name2 + " are the same (=).");
       else 
         System.out.println(name1 + " and " + name2 + " are not the same (=).");
         
        // USING THE EQUALS METHOD
        if (name1.equals(name2))
        System.out.println(name1 + " and " + name2 + " are the same (equals()).");
        else
        System.out.println(name1 + " and " + name2 + " are different (equals()).");
        
        if (name1.equals(name3))
        System.out.println(name1 + " and " + name3 + " are the same (equals()).");
        else
        System.out.println(name1 + " and " + name3 + " are different (equals()).");
        
        // USING THE COMPARETO METHOD
         if (name1.compareTo(name2) < 0)
        System.out.println(name1 + " is less than " +  name2);
        else if (name1.compareTo(name2) == 0)
        System.out.println(name1 + " is equal to " + name2);
          else if (name1.compareTo(name2) > 0 )
         System.out.println(name1 + " is greater than " + name2);
         
         if (name1.compareTo(name3) < 0)
        System.out.println(name1 + " is less than " +  name3);
        else if (name1.compareTo(name3) == 0)
        System.out.println(name1 + " is equal to " + name3);
         else if (name1.compareTo(name3) > 0 )
         System.out.println(name1 + " is greater than " + name3);

           
   }  // end main()
}  // end class