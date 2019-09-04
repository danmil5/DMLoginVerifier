package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //mainStage = primaryStage;
        setPrimaryStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scene = new Scene(root, 300, 275);

        primaryStage.setScene(scene);
        primaryStage.setTitle("FXML Welcome");
        primaryStage.show();
    }

    private void setPrimaryStage(Stage stage) {
        Main.mainStage = stage;
    }

    static public Stage getPrimaryStage() {
        return mainStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}

