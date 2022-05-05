package ecole;

import stage.Stagiaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        Specialités s1 = new Specialités("JAVA", "Cours java" );
        Specialités s2 = new Specialités("sécurité informatique", "Cours SI" );
        Specialités s3 = new Specialités("PHP", "Cours php" );
        Specialités s4 = new Specialités("gestion de projet", "Cours GE" );
        Specialités s5 = new Specialités("cisco", "Cours cisoc" );

        System.out.println("les spécialités sont : ");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
       // System.out.println("la liste des professeur est : ");

        List<Professeur> professeurList = new ArrayList<>();
        String prenom , nom , email ,num; Specialités nomSpecialite;

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<2 ;i++){
            System.out.println("entres les parametre du professeur");
            prenom= sc.nextLine();
            nom= sc.nextLine();
            email= sc.nextLine();
            num= sc.nextLine();
            nomSpecialite = null;

            Professeur p = new Professeur(prenom , nom , email , num ,nomSpecialite);
//            if(i<= 1){
//            p.setSpecialités(String.valueOf(s1));}
//            else if(i == 2){
//                p.setSpecialités(String.valueOf(s5));
//            }
//            else {
//                p.setSpecialités(String.valueOf(s3));
//            }
            professeurList.add(p);
        }
        System.out.println("Liste des professeurs: ");
        System.out.println(professeurList);
        System.out.println("Enter une specialité");
        String s = sc.nextLine();
        System.out.println("Liste des professeurs par spécialité: ");
         professeurList.stream().filter(p -> p.getSpecialite().equals(s)).collect(Collectors.toList());
        //List<Professeur> professeursRecherche = professeurList.stream().filter(p -> p.getSpecialite().equals(s)).collect(Collectors.toList());
       // System.out.println(professeursRecherche);
//        p.setPrenom("adama");
//        p.setNom("ndour");
//        p.setEmail("ado@gmail.com");
//        p.setSpecialités(String.valueOf(s1));
//        p.setNum(774569852);
//
//        Professeur p1 = new Professeur();
//        p1.setPrenom("awa");
//        p1.setNom("ndour");
//        p1.setEmail("awa@gmail.com");
//        p1.setSpecialités(String.valueOf(s1));
//        p1.setNum(784569852);
//
//        Professeur p2 = new Professeur();
//        p2.setPrenom("modou");
//        p2.setNom("fall");
//        p2.setEmail("modou@gmail.com");
//        p2.setSpecialités(String.valueOf(s5));
//        p2.setNum(764569852);
//
//        Professeur p3 = new Professeur();
//        p3.setPrenom("omar");
//        p3.setNom("diouf");
//        p3.setEmail("od@gmail.com");
//        p3.setSpecialités(String.valueOf(s5));
//        p3.setNum(754569852);
//
//        Professeur p4 = new Professeur();
//        p4.setPrenom("fatou");
//        p4.setNom("samb");
//        p4.setEmail("fatousamb@gmail.com");
//        p4.setSpecialités(String.valueOf(s3));
//        p4.setNum(704569852);











    }
}
