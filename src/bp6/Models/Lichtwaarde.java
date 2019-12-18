package bp6.Models;

import java.sql.Time;

public class Lichtwaarde extends Ruimte {

    private Time tijd;
    private int luxBinnen;
    private int luxBuiten;

    public Lichtwaarde(String id, Time tijd, int luxBinnen, int luxBuiten) {
        super(id);
        this.tijd = tijd;
        this.luxBinnen = luxBinnen;
        this.luxBuiten = luxBuiten;
    }

    public Time getTijd() {
        return tijd;
    }

    public void setTijd(Time tijd) {
        this.tijd = tijd;
    }

    public int getLuxBinnen() {
        return luxBinnen;
    }

    public void setLuxBinnen(int luxBinnen) {
        this.luxBinnen = luxBinnen;
    }

    public int getLuxBuiten() {
        return luxBuiten;
    }

    public void setLuxBuiten(int luxBuiten) {
        this.luxBuiten = luxBuiten;
    }
}