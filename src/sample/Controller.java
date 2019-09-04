package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actiontarget;
    @FXML private TextField user;
    @FXML private PasswordField pass;


    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        if (user.getText().equals("admin") && pass.getText().equals("password")) {
            actiontarget.setText("Administrator Login Successful");
        }
        else if (user.getText().equals("Emma") && pass.getText().equals("Jones")) {
            actiontarget.setText("Welcome back emma.jones@example.com");
        }
        else if (user.getText().equals("Emma") && pass.getText().equals("Jones")) {
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
    }
}
