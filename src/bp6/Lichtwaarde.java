package bp6;

import java.time.LocalDateTime;

public class Lichtwaarde extends Ruimte {

    private LocalDateTime tijd;
    private int luxBinnen;
    private int luxBuiten;

    public Lichtwaarde(LocalDateTime tijd, int luxBinnen, int luxBuiten, String id){
        super(id);
        this.tijd = tijd;
        this.luxBinnen = luxBinnen;
        this.luxBuiten = luxBuiten;
    }

    public LocalDateTime getTijd() {
        return tijd;
    }

    public void setTijd(LocalDateTime tijd) {
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