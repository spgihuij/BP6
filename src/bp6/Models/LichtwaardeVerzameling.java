package bp6.Models;

import bp6.Controllers.DatabaseController;

import java.util.ArrayList;

public class LichtwaardeVerzameling {


    private int count;
    private Lichtwaarde lastLichtWaarde;
    private DatabaseController DBController;
    private ArrayList<Lichtwaarde> lichtwaardes;


    public LichtwaardeVerzameling(DatabaseController dbController) {
        this.DBController = dbController;
        lichtwaardes = DBController.getLichtwaarden();
    }

    public int Count() {
        return count;
    }


    private void checkArrayList()
    {
        lastLichtWaarde = DBController.getLichtwaarde();

        if( lastLichtWaarde.getTijd().equals(lichtwaardes.get(20).getTijd()))
        {
            pop();
            lichtwaardes.add(lastLichtWaarde);
        }
    }

    private void pop(){

        if(lastLichtWaarde != lichtwaardes.get(0)){
            lichtwaardes.remove(0);
        }

    }

    public ArrayList<Lichtwaarde> getLichtwaardes() {
        return lichtwaardes;
    }
}