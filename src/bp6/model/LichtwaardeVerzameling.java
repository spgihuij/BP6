package bp6.model;

import bp6.controller.DatabaseController;

import java.util.ArrayList;

public class LichtwaardeVerzameling {

    private Lichtwaarde first;
    private Lichtwaarde last;
    private int count;

    private DatabaseController DBController;
    private ArrayList<Lichtwaarde> lichtwaardes;

    public LichtwaardeVerzameling(DatabaseController dbController) {
        lichtwaardes = new ArrayList<>();
        this.DBController = dbController;
        RetrieveData();
    }

    public void Enqueue(Lichtwaarde lichtwaarde)
    {
        Lichtwaarde newLink = new Lichtwaarde();

        if(first == null)
        {
            first = newLink;
            last = newLink;
            count = 1;
        }
        else
        {
            last.next = newLink;
            last = newLink;
            count++;
        }
    }

    public void Dequeue()
    {
        if (first != null)
        {
            Lichtwaarde tempLink = first;
            first = first.next;
            count--;
        }
    }

    public int Count()
    {
        return count;
    }

    private void RetrieveData() {
        lichtwaardes = DBController.getLichtwaarde();
    }
}
