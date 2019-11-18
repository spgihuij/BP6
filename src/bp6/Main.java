package bp6;

import bp6.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private MainController controller;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        controller = new MainController();

        Scene scene = new Scene(controller.mainPane, 1200, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BP6");
        primaryStage.show();
    }

}