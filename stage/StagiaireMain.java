package stage;

import java.util.*;

public class StagiaireMain {
    public static void main(String[] args) {

        String prenom , nom , role  ;
        Scanner sc = new Scanner(System.in);
        List<Stagiaire> stagiaireList= new ArrayList<>();

        for(int i=0 ; i<2; i++) {
            System.out.println("donner les paramètres du stagiaire");
            prenom = sc.nextLine();
            nom = sc.nextLine();
            role = sc.nextLine();
            Stagiaire stagiaire = new Stagiaire(prenom, nom, role);
            System.out.println(stagiaire.toString());
            stagiaireList.add(stagiaire);
        }
        System.out.println(stagiaireList);


        



    }


}
