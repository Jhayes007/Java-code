/* Filename: JavaFXMarginDemo.java
   Author: J. Hayes
   Date: Sep. 03, 2020
   Purpose: To demonstrate the basic concepts of JavaFX. Margins.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class JavaFXMarginDemo extends Application
{
   @Override
   public void start(Stage stage)
   {
      // Create the label and the button
      Label label = new Label("This is a label.");
      Button button = new Button("Button");
      // Set the margins for a VBox pane on the label and button
      Insets insets = new Insets(10);
      VBox.setMargin(label, insets);
      VBox.setMargin(button, insets);
      // Create a VBox with default spacing and alignment
      VBox pane = new VBox();
      // Add the label and the button to the children of the pane
      pane.getChildren().addAll(label, button);
      // Set the pane on the scene
      Scene scene = new Scene(pane, 250, 80);
      stage.setScene(scene);
      stage.setTitle("Margin Example");
      stage.show();
   }  // end start()
   
   public static void main(String[] args)
   {
      launch(args);
   }  // end main()
}  // end class