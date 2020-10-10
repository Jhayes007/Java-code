/* Filename: SimpleJavaFXApp.java
   Author: J. Hayes
   Date: Sep. 01, 2020
   Purpose: To demonstrate the basic concepts of JavaFX.
*/

import javafx.application.Application;
import java.stage.Stage;

public class SimpleJavaFXApp extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }  // end main()
   
   @Override
   public void start(Stage stage)
   {
      stage.setTitle("Simple JavaFX Application");
      stage.show();
   }  // end start()
}  // end class