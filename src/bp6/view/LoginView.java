package bp6.view;

import bp6.controller.DatabaseController;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LoginView extends Pane {
    private ComboBox cbxGebruikers;
    private Button btnLogin;
    private ResultSet result;
    private DatabaseController connector;
    private FXMLLoader loader;

    public LoginView() {
        loader = new FXMLLoader(getClass().getResource("//bp6/fxml/LoginView.fxml"));
        cbxGebruikers = new ComboBox();
        btnLogin = new Button();
        connector = new DatabaseController();

        String strSQL = "select NAAM from GEBRUIKER";
        result = connector.getData(strSQL);
        try {
            while (result.next()) {
                String strNaam = result.getString("naam");
                cbxGebruikers.getItems().add(strNaam);
                System.out.println(strNaam);
            }
        } catch (Exception e) {

        }

    }

}
