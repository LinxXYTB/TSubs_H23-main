// Classe dérivée Ville
class Ville extends Pays {
    private String nomVille;

    // Constructeur
    public Ville(String nom, int population, String nomVille) {
        super(nom, population);
        this.nomVille = nomVille;
    }

    // Getter et setter
    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }
    public String getNomVille() {
        return nomVille;
    }
   //TODO 3
   @Override
   public void afficherDetails() {
        System.out.println("Ville: " + nomVille);
        super.afficherDetails();
   }
}