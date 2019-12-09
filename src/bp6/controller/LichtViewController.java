package bp6.controller;

import bp6.model.LichtwaardeVerzameling;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class LichtViewController {

    private Parent lichtView;
    private LichtwaardeVerzameling lichtwaardes;


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
