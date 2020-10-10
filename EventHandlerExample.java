/* Filename: JavaFXImage Demo.java
   Author: J. Hayes
   Date: Sep. 03, 2020
   Purpose: To demonstrate the basic concepts of JavaFX.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.swing.JOptionPane;

public class EventHandlerExample extends Application
{
   @Override
   public void start(Stage stage)
   {
   // Create a button and set a handler on the button
   Button button = new Button("Click Me!");
   button.setOnAction(new SimpleEventHandler());
   // Create a VBox with center alignment
   VBox vbox = new VBox();
   vbox.setAlignment(pos.CENTER);
   // Add the button to VBox and set VBox as the scene
   vbox.getChildren().add(button);
   stage.setScene(new Scene(vbox, 250, 80));
   stage.setTitle("Event Handler");
   stage.show();
   }  // end start()
   
   public static void main(String[] args)
   {
      launch();
   }  // end main()
   
   // Handler class
   class SimpleEventHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         JOptionPane.showMessageDialog(null, "Hello JavaFX!");
      }  // end handle()
   }  // end class
}  // end class