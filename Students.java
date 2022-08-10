import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Write a description of JavaFX class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students extends Application
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    private Label lblDisplay= new Label("Enter your name: ");
    private Button BtnEnter = new Button("Enter");
    //private TextField 

    @Override
    public void start(Stage stage) throws Exception
    {
        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //set an action on the button using method reference
        BtnEnter.setOnAction(this::buttonClick);

        // Add the button and label into the pane
        pane.add(lblDisplay, 1, 0);
        pane.add(BtnEnter, 0, 0);
        

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(pane, 300,100);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    private void buttonClick(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        count = count + 1;
        lblDisplay.setText(Integer.toString(count));
    }
}
