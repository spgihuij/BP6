package bp6.model;

public class Ruimte {

    protected String id;
    private String lampen;

    public Ruimte(String id) {
        this.id = id;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLampen() {
        return lampen;
    }

    public void setLampen(String lampen) {
        this.lampen = lampen;
    }
}