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

    public int getLuxBinnen() {
        return luxBinnen;
    }

    public int getLuxBuiten() {
        return luxBuiten;
    }
}