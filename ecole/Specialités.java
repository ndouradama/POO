package ecole;

public class Specialités {
    private String nom;
    private String libelle;

    public Specialités( String nom, String libelle ) {
        this.nom = nom;
        this.libelle = libelle;
    }

    public String getNom() {
        return nom;
    }


    public String getLibelle() {
        return libelle;
    }


    public String toString() {
        return this.nom ;
    }
}
