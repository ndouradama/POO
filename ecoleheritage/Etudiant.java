package ecoleheritage;

public class Etudiant extends Person {
    private String cne;


    public Etudiant(String prenom, String nom,int id,  String cne) {
        super(prenom, nom,id);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }
    public void setCne(String cne) {
        this.cne = cne;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + getCne();
    }
}
