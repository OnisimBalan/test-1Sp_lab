package test_sp;

//Factory Pattern
public class creatura {
    private String batalion;
    private String nume;
    private Integer viata;
    private Integer atac;

    public creatura(String batalion, String nume, Integer viata, Integer atac) {
        this.batalion = batalion;
        this.nume = nume;
        this.viata = viata;
        this.atac = atac;
    }

    public Integer getAtac() {
        return atac;
    }

    public String getBatalion() {
        return batalion;
    }

    public Integer getViata() {
        return viata;
    }

    public void setViata(Integer viata) {
        this.viata = viata;
    }

    public void attack(creatura inamic) {
        if (this.viata > 0) {
            if (inamic.getViata() > 0) {
                this.vorbeste();
                inamic.setViata(viata);
                System.err.println(this.nume + "la atact Sauron cu " + atac);
            } else {
                System.err.println("Sauron este mort!");
            }

            if (this.viata > 0) {
                inamic.attack(this);
                System.err.println("Sauron la atact cu " + atac + "atac pe " + this.nume);
            } else {
                System.err.println(this.nume + "  este mort!");
            }
        }
    }

    public void vorbeste() {
        System.err.println("Numnele meu este: " + nume);
    }

    public void message() {
        System.err.println("A murit: " + nume);
    }
}