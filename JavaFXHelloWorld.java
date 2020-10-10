/* Filename: JavaFXHelloWorld.java
   Author: J. Hayes
   Date: Sep. 01, 2020
   Purpose: To demonstrate the basic concepts of JavaFX. This will form a scene, put it
            on a stage and show it on the screen.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class JavaFXHelloWorld extends Application
{
   @Override
   public void start(Stage stage)
   {
      // Create a label
      Label label = new Label("Hello World!");
      // Set the scene as root of the scene graph
      Scene scene = new Scene(label, 300, 800);
      stage.setScene(scene);
      // Set the stage title and show the stage
      stage.setTitle("Hello World!");
      stage.show();
   }  // end start
   
   public static void main(String[] args)
   {
      launch();
   }  // end main()
}  // end class

