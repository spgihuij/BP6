package bp6.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class BewegingsViewController {
    private Parent bewegingsView;
    //@FXML
    Label lblBeweging;

    public BewegingsViewController(){
        setBewegingsView();

        //lblBeweging = new Label();
        //lblBeweging.setText("ABLOBIEBOp");
    }

    public void setBewegingsView(){
        try
        {
            bewegingsView = FXMLLoader.load(getClass().getResource("/bp6/resources/BewegingsView.fxml"));
        }

        catch(Exception e)
        {
            System.out.println("error code: " + e);
        }
    }

    public Parent getBewegingsView() {
        return bewegingsView;
    }
}
