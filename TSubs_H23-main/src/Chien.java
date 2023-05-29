// Classe dérivée
// TODO 1.1
class Chien extends Animal {
    private String race;
    
    public Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("]", "") + ", race=" + race + " ]";
    }

    public void faireDuBruit() {
        System.out.print("woof woof");
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
}
