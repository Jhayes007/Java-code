/* Filename: JavaFXImageDemo.java
   Author: J. Hayes
   Date: Sep. 01, 2020
   Purpose: To demonstrate the basic concepts of JavaFX. This will form a scene, put it
            on a stage and show it on the screen.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class JavaFXImageDemo extends Application
{
   @Override
   public void start(Stage pStage)
   {
      // Create an image object
      Image image = new Image("file:whale.jpg");
      // Create an imageview object
      ImageView imageview = new ImageView(image);
      // Put the image view in an HBox
      HBox hbox = new HBox(imageview);
      // Create a Scene with the HBox as its root
      Scene scene = new Scene(hbox);
      // Add the scene to the stage
      pStage.setScene(scene);
      // Set the stage title 
      pStage.setTitle("whale");
      // Show the window
      pStage.show();
   }  // end start()
   
   public static void main(String[] args)
   {
      launch(args);
   }  // end main()
}  // end class