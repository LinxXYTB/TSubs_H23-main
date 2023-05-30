// Classe utilisant les exceptions personnalisées
class ExempleExceptionsPersonnalisees {
    private int valeur;

    // Méthode pour définir la valeur. N'acepte que des valeurs entre 1 et 100 inclusivement.
    //TODO 7

    public void setValeur(int valeur) {
        try {
            effectuerOperation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        this.valeur = valeur;
    }

    // Méthode pour effectuer une opération
    public void effectuerOperation() throws OperationNonAutoriseeException, ValeurHorsLimiteException {
        // Condition de vérification pour l'opération
        boolean condition = true;

        if (!condition) {
            throw new OperationNonAutoriseeException("L'opération n'est pas autorisée.");
        }

        // Logique de l'opération
        // Il n'y a pas vraiment d'operation non autorisee, car c'est deja entre 1 et 100, donc on ne peut pas le diviser par 0 et on peut fair le reste des operations

        if (valeur > 100 || valeur < 1) {
            throw new ValeurHorsLimiteException("La valeur doit etre entre 1 et 100");
        }
    }
}