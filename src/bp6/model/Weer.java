package bp6.model;

import java.time.LocalDateTime;

public class Weer {
    private LocalDateTime tijd;
    private double temperatuur;
    private String beschrijving;

    public Weer(LocalDateTime tijd, double temperatuur, String beschrijving) {
        this.tijd = tijd;
        this.temperatuur = temperatuur;
        this.beschrijving = beschrijving;
    }

    public LocalDateTime getTijd() {
        return tijd;
    }

    public void setTijd(LocalDateTime tijd) {
        this.tijd = tijd;
    }

    public double getTemperatuur() {
        return temperatuur;
    }

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }
}
