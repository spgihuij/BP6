package bp6;

import java.awt.*;

public class WeerView  extends ContainerView {
private Label lblZonkracht;
private Label lblTemperatuur;
    private Label lblVoorspelling;
    private Label lblAdvies;

    private ContainerView containerView;

    public WeerView(){
        containerView = new ContainerView();
        lblAdvies = new Label();
        lblTemperatuur = new Label();
        lblVoorspelling = new Label();
        lblZonkracht = new Label();

    }

}
