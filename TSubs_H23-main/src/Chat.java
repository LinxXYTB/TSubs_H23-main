// Classe dérivée
// TODO 1.2
class Chat extends Animal {
    private boolean estInterieur;
    
    public Chat(String nom, int age, boolean estInterieur) {
        super(nom, age);
        this.estInterieur = estInterieur;
    }

    @Override
    public String toString() {
        if (estInterieur) {
            return super.toString().replaceAll("]", "") + ", est interieur ]";
        }else{
            return super.toString().replaceAll("]", "") + ", n'est pas interieur ]";
        }
    }

    public void faireDuBruit() {
        System.out.println("woof woof");
    }
    public boolean getInterieur(){
        return estInterieur;
    }
    public void setInterieur(boolean estInterieur) {
        this.estInterieur = estInterieur;
    }
}