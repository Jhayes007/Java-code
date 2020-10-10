/* Filename: JavaFXHelloWorld02.java
   Author: J. Hayes
   Date: Sep. 01, 2020
   Purpose: To demonstrate the basic concepts of JavaFX. This will form a scene, put it
            on a stage and show it on the screen.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class JavaFXHelloWorld02 extends Application
{
   @Override
   public void start(Stage pStage)
   {
      // Create the label
      Label msgLabel = new Label("Hello world");
      // Put the label in a horizontal box
      HBox hbox = new Hbox(msgLabel);
      // Create the scene with the HBox as its root
      Scene scene = new Scene(hbox, 300, 100);
      // Set the HBox's alignment to center
      hbox.setAlignment(Pos.CENTER);
      // Add the scene to the stage
      pStage.setScene(scene);
      // Set the stage title
      pStage.setTitle("My Second Scene");
      // Show the stage
      pStage.show();
   }  // end start()
   
   public static void main(String[] args)
   {
      launch();
   }  // end main()
}  // end class