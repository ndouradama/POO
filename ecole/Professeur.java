package ecole;

public class Professeur {

        private String prenom;
        private String nom;
        private String email;
        private Specialités specialités;
        private String num;

        public Professeur(String prenom , String nom , String email , String num ,  Specialités  specialités ) {
                this.prenom = prenom;
                this.nom = nom ;
                this.email = email;
                this.num=num;
                this.specialités = specialités;
        }

        public String getPrenom() {
                return prenom= prenom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        public String getNom() {
                return nom = nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public Specialités getSpecialite() {return specialités;}

        public void setSpecialités(Specialités specialités) {
                specialités = specialités;
        }

        public String getEmail() {
                return email = email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getNum() {
                return this.num = num;
        }

        public void setNum(String num) {
                this.num = num;
        }

        public String toString() {
                return prenom+ " - " + nom + " - " + num + " - " + email + " - " + specialités;  }



}
