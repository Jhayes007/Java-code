/* 
   Filename: WhileInputValidation.java
   Author: J.Hayes
   Date: Feb. 3, 2020
   Purpose: To demonstrate the use of the while loop in java. Here the while loop is being used for validating input.           
*/

import javax.swing.JOptionPane;

public class WhileInputValidation
{
   public static void main(String[] args)
   {
      // Constant and variable declarations
      final int MINPLAYERS = 9;
      final int MAXPLAYERS = 15;
      int players;
      int teamSize;
      int teams;
      int leftOver;
      String input;
      
      // Get the number of players per team
      input = JOptionPane.showInputDialog("Enter the number of players per team: ");
      teamSize = Integer.parseInt(input);
      
      // Validate the number entered
      while (teamSize < MINPLAYERS || teamSize > MAXPLAYERS)
      {
         input = JOptionPane.showInputDialog("The number of players must be at least " +
                        MINPLAYERS + " and no more than " + MAXPLAYERS +
                        ".\n Enter the number of players: ");
         teamSize = Integer.parseInt(input);                  
      }  // end while
      
      // Get the number of available players
      input = JOptionPane.showInputDialog("Enter the available number of players: ");
      players = Integer.parseInt(input);
      
      // Validate this number (another validation loop)
      while (players < 0)  // Validating that a negative number isn't entered
      {
         input = JOptionPane.showInputDialog("Enter 0 or greater: ");
         players = Integer.parseInt(input);
      }  // end while
      
      // Calculate the number of teams
      teams = players / teamSize;
      // Calculate the number of leftover players
      leftOver = players % teamSize;
      // Display the results
      JOptionPane.showMessageDialog(null, "There will be " + teams + " teams with " +
                                    leftOver + " players left over.");
      System.exit(0);                            
   }  // end main()
}  // end class