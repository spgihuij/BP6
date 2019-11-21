package bp6.view;

import javafx.scene.layout.Pane;

import java.awt.*;

public class WeerView extends Pane {
private Label lblZonkracht;
private Label lblTemperatuur;
    private Label lblVoorspelling;
    private Label lblAdvies;




    public WeerView(){
        lblAdvies = new Label();
        lblTemperatuur = new Label();
        lblVoorspelling = new Label();
        lblZonkracht = new Label();
    }

}
