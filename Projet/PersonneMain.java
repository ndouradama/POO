package Projet;

public class PersonneMain {

    public static void main(String[] args) {

        Personne p1 = new Personne("awa", "ndour", "mbao");
        Personne p = new Personne();
        p.setPrenom("adama");
        p.setAdresse("sicap");
        p.setNom("ndour");

        System.out.println( p1.toString() );

        System.out.printf(" %s - %s - %s ", p.getPrenom(), p.getNom() , p.getAdresse() );




    }
}
