package Projet;

public class Personne {
    private String prenom;
    private String nom;
    private String adresse;


    public Personne(String prenom , String nom, String adresse) {
        this.prenom = prenom;
        this.nom= nom;
        this.adresse= adresse;
    }
    public Personne (){

    }

    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getAdresse() {
        return this.adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return String.format(" %s - %s - %s ", prenom , nom , adresse );
    }
}
