/* Filename: JavaFXKMConverterLambdaExpr.java
   Author: J. Hayes
   Date: Sep. 08, 2020
   Purpose: To demonstrate the basic concepts of JavaFX. Event Handling 
            --- passing information to the event handler class constructor
            using a lambda expression. This example uses the example of conversion
            of kilometers to miles.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;

public class JavaFXKMConverterLambdaExpr extends Application
{
   private TextField kiloTextField;
   private Label resultLabel;
   
   public static void main(String[] args)
   {
      launch(args);
   }  // end main()
   
   @Override
   public void start(Stage pStage)
   {
      Label promptLabel = new Label("Enter a distance in kilometers: ");
      kiloTextField = new TextField();
      Button calcButton = new Button("Convert");
      
      // Create an event handler
      calcButton.setOnAction(event -> 
      {
         double kilometers = Double.parseDouble(kiloTextField.getText());
         double miles = kilometers * 0.6214;
         resultLabel.setText(String.format("%,.2f miles", miles));
         });
         
         resultLabel = new Label();
         
         HBox hbox = new HBox(10, promptLabel, kiloTextField);
         VBox vbox = new VBox(10, hbox, calcButton, resultLabel);
         vbox.setAlignment(Pos.CENTER);
         vbox.setPadding(new Insets(10));
         Scene scene = new Scene(vbox);
         
         pStage.setScene(scene);
         pStage.setTitle("kilometer Converter");
         pStage.show();
   }  // end start()
}  // end class