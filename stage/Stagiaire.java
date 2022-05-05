package stage;


public class Stagiaire {

    private String prenom;
    private String nom;
    private String role;

     public Stagiaire ( String prenom , String nom , String role){
        this.prenom = prenom;
        this.nom = nom ;
        this.role = role;
     }

    public String getPrenom(String s) {
        return this.prenom;
    }
    public String getNom(String s) {
        return this.nom;
    }
    public String getRole(String s) {
        return this.role;
    }



        public String toString() {
        return  this.prenom +  " " + this.nom + "  " + this.role ;

    }
}

