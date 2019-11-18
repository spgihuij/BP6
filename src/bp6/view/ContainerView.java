package bp6.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class ContainerView extends Pane {
    private MenuBar mbMenu;
    private Menu mOverzicht;
    private MenuItem miLichtView;
    private MenuItem miBewegingView;
    private MenuItem miWeerView;

    private Pane pane;

    public ContainerView(){
        pane = new Pane();
        mbMenu = new MenuBar();
        mOverzicht = new Menu("Overzicht");
        miLichtView = new MenuItem("Licht");
        miBewegingView = new MenuItem("Beweging");
        miWeerView = new MenuItem("Weer");

        mbMenu.getMenus().add(mOverzicht);
        mOverzicht.getItems().addAll(miBewegingView, miLichtView, miWeerView);
        this.getChildren().addAll(mbMenu, pane);
    }
}
