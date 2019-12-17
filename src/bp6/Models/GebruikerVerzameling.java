package bp6.Models;

import bp6.Controllers.DatabaseController;

import java.util.ArrayList;

public class GebruikerVerzameling {

    private DatabaseController DBController;
    private ArrayList<Gebruiker> gebruikers;

    public GebruikerVerzameling(DatabaseController dbController) {
        gebruikers = new ArrayList<>();
        this.DBController = dbController;
        RetrieveData();
    }

    private void RetrieveData() {
        gebruikers = DBController.getGebruikers();
    }
}
