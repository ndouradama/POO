package ecoleheritage;

public class Professeur extends Employe {
    private String specialite;

    public Professeur( String prenom, String nom, int id, double salaire, String specialite) {
        super(prenom, nom, id, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + getSpecialite();
    }
}
