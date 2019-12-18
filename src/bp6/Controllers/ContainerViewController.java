package bp6.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class ContainerViewController {

    private Parent containerView;

    public ContainerViewController(){
        setContainerView();
    }

    public void setContainerView(){
        try
        {
            containerView = FXMLLoader.load(getClass().getResource("/bp6/resources/ContainerView.fxml"));
        }

        catch(Exception e)
        {
            System.out.println("error code: " + e);
        }
    }

    public Parent getContainerView() {
        return containerView;
    }
}
