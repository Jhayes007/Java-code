/* Filename: JavaFXCSSDemo01.java
   Author: J. Hayes
   Date: Sep. 08, 2020
   Purpose: To demonstrate the basic concepts of JavaFX. In this application we will use
               CSS to format text.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class JavaFXCSSDemo01 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }  // end main()
   
   @Override
   public void start(Stage pStage)
   {
      // Create a label
      Label myLabel = new Label("Hello Third Week!");
      // Put the Label in vbox
      VBox vbox = new VBox(myLabel);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(10));
      // Create a Scene and display it
      Scene scene = new Scene(vbox);
      scene.getStylesheets().add("demo1.css");
      pStage.setScene(scene);
      pStage.show();
   }  // end start()
}  // end class