package bp6.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class LichtViewController {

    private Parent lichtView;

    public LichtViewController(){
        setLichtView();
    }

    public void setLichtView(){
        try
        {
            lichtView = FXMLLoader.load(getClass().getResource("/bp6/resources/LichtView.fxml"));
        }

        catch(Exception e)
        {
            System.out.println("error code: " + e);
        }
    }

    public Parent getLichtView() {
        return lichtView;
    }
}
