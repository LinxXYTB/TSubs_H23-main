// Classe Impot
class Impot {
    private String nomContribuable;
    private double revenuAnnuel;
    private double tauxImposition;

    // Constructeur
    public Impot(String nomContribuable, double revenuAnnuel, double tauxImposition) {
        this.nomContribuable = nomContribuable;
        this.revenuAnnuel = revenuAnnuel;
        this.tauxImposition = tauxImposition;
    }

    // Getter et setter
    public String getNomContribuable() {
        return nomContribuable;
    }

    public void setNomContribuable(String nomContribuable) {
        this.nomContribuable = nomContribuable;
    }

    //TODO 4
    public double getRevenuAnnuel() {
        return revenuAnnuel;
    }
    public void setRevenuAnnuel(double revenuAnnuel) {
        this.revenuAnnuel = revenuAnnuel;
    }
    public double getTauxImposition() {
        return tauxImposition;
    }
    public void setTauxImposition(double tauxImposition) {
        this.tauxImposition = tauxImposition;
    }
    public double calculeImpot(){
        return revenuAnnuel*tauxImposition;
    }
}
