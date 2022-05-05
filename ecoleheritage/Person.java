package ecoleheritage;

public class Person {
    private String prenom;
    private String nom;
    private int id;

//    public Person() {
//    }

    public Person( String prenom, String nom , int id) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getPrenom() + "  " + getNom() + "  " + getId() ;
    }
}
