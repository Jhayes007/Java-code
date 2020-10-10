/* Filename: JavaFXClickCounterLambda.java
   Author: J. Hayes
   Date: Sep. 03, 2020
   Purpose: To demonstrate the basic concepts of JavaFX. Event Handling 
            --- passing information to the event handler class constructor
            using a lambda expression.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class JavaFXClickCounterLambda extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }  // end main()
   
   @Override
   public void start(Stage stage)
   {
      // Create a label and a button
      Label label = new Label("0");
      Button button = new Button("Click");
   
   // Use a lambda expression for event handler
   button.setOnAction(
      event ->
      {
         int count = Integer.parseInt(label.getText());
         count++;
         label.setText(String.valueOf(count));
      });
      
   // Add the label and button to a vbox
   VBox pane = new VBox(10);
   pane.setAlignment(Pos.CENTER);
   pane.getChildren().addAll(label, button); 
   // Put the vbox on the scene and set the stage up
   stage.setScene(new Scene(pane, 200, 80));
   stage.setTitle("Click Counter");
   stage.show();
   }  // end start()
}  // end class