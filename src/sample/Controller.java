package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {
    @FXML private Text actiontarget;
    @FXML private TextField user;
    @FXML private PasswordField pass;


    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        boolean loggedin = false;
        if (user.getText().equals("admin") && pass.getText().equals("password")) {
            actiontarget.setText("Administrator Login Successful");
            loggedin = true;
        }
        else if (user.getText().equals("Emma") && pass.getText().equals("Jones")) {
            actiontarget.setText("Welcome back emma.jones@example.com");
        }
        else if (user.getText().equals("Ethan") && pass.getText().equals("Williams")) {
            actiontarget.setText("Welcome back ethan.william@example.com");
        }
        else if (user.getText().equals("Isabella") && pass.getText().equals("Johnson")) {
            actiontarget.setText("Welcome back isabella.johnson@example.com");
        }
        else if (user.getText().equals("Jacob") && pass.getText().equals("Smith")) {
            actiontarget.setText("Welcome back jacob.smith@example.com");
        }
        else if (user.getText().equals("Michael") && pass.getText().equals("Brown")) {
            actiontarget.setText("Welcome back michael.brown@example.com");
        }
        else {
            actiontarget.setText("Invalid Login Credentials");
        }
        if (loggedin) {
            Stage stage = new Stage();
            stage.setTitle("Scene 2");
            try {
                Pane myPane = (Pane) FXMLLoader.load(getClass().getResource
                        ("loggedinscene.fxml"));
                Scene myScene = new Scene(myPane);
                stage.setScene(myScene);
                stage.show();
            }
            catch (Exception e) {
            }

        }
    }
}
