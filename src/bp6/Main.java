package bp6;

import bp6.Controllers.MainController;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private MainController controller;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        controller = new MainController();

        Parent root = controller.getRootView();

        Scene scene = new Scene(root, 1200, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BP6");
        primaryStage.show();
    }
}