package bp6.Models;

import bp6.Controllers.DatabaseController;
import javafx.scene.chart.XYChart;

import java.util.ArrayList;

public class LichtwaardeVerzameling {


    private int count;

    private DatabaseController DBController;
    private Lichtwaarde lastLichtWaarde;
    private XYChart.Series lichtwaardes;


    public LichtwaardeVerzameling(DatabaseController dbController) {
        this.DBController = dbController;
        RetrieveLichtWaardeArrayList();
    }

    public int Count()
    {
        return count;
    }
/*
    private void checkArrayList()
    {
        lastLichtWaarde = DBController.getLichtwaarde();

        if( lastLichtWaarde.getTijd().compareTo(lichtwaardes.get(20).getTijd()) != 0)
        {
            pop();
            lichtwaardes.add(lastLichtWaarde);
        }
    }
*/
    private void RetrieveLichtWaardeArrayList() {
        lichtwaardes = DBController.getLichtwaarden();
    }



    public  XYChart.Series getLichtwaardes() {
        return lichtwaardes;
    }
}
