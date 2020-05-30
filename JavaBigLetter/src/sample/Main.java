package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Controller controller = new Controller();
        loader.setController(controller);
        Parent root = loader.load();
        primaryStage.setTitle("Big Letter");
        primaryStage.setScene(new Scene(
                root,
                Screen.getScreens().get(0).getBounds().getWidth()/1.5f,
                Screen.getScreens().get(0).getBounds().getHeight()/1.5f)
        );
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
