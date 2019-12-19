package bp6.Models;

import java.sql.Time;

public class Lichtwaarde extends Ruimte {

    private String tijd;
    private int luxBinnen;
    private int luxBuiten;

    public Lichtwaarde(String tijd, int luxBinnen, int luxBuiten) {
        this.tijd = tijd;
        this.luxBinnen = luxBinnen;
        this.luxBuiten = luxBuiten;
    }

    public String getTijd() {
        return tijd;
    }

    public void setTijd(String tijd) {
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