// Classe dérivée Voiture
class Voiture extends Vehicule {
    private int nombrePortes;

    // Constructeur
    public Voiture(String marque, String modele, int annee, int nombrePortes) {
        super(marque, modele, annee);
        this.nombrePortes = nombrePortes;
    }

    // Getter et setter
    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }
    public int getNombrePortes() {
        return nombrePortes;
    }
    //TODO 5
    @Override
    public String toString() {
        return "Marque= " + super.getMarque() + ", Modele= " + super.getModele() + ", Annee= " + super.getAnnee() + ", Nombre portes= " + nombrePortes;
    }

}
