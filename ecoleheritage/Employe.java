package ecoleheritage;

public class Employe extends Person {
    private double salaire;

    public Employe(String prenom, String nom, int id, double salaire) {
        super(prenom, nom, id);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + getSalaire();
    }
}
