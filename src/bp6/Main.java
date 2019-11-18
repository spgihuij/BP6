package bp6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private LoginView loginView;

    public void start(Stage primaryStage) {
        Pane mainPane = new Pane();
        LoginView loginView = new LoginView();
        mainPane.getChildren().add(loginView);
        Scene scene = new Scene(mainPane, 1200, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BP6");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
