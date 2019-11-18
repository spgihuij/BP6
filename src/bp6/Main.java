package bp6;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

    private Pane ContainerView;

    public void start(Stage primaryStage){
        Pane mainPane = new Pane();
        mainPane.getChildren().add(ContainerView);
        Scene scene = new Scene(ContainerView, 800, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BP6");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
