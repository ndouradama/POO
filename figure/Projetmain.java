package figure;

import java.util.Scanner;

public class Projetmain {

    public static void main(String[] args) {

        Carre c =new Carre();
        Rectangle rec = new Rectangle();
        Cercle cer = new Cercle();
        System.out.println("1) rectangle");
        System.out.println("2) carré");
        System.out.println("3) cercle");

        System.out.println("choisissez la figure à calculer");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        switch (choix){
            case 1:
                System.out.println("donner la longuer et la largeur");
                rec.getLar();
                rec.getLon();
                rec.perimetre();
                rec.aire();
                System.out.println(rec.toString());
                break;
            case 2:
                System.out.println("donner le côté du carré");
                c.getCote();
                c.aire();
                c.perimetre();
                System.out.println(c.toString());
                break;
            case 3:
                System.out.println("donner le rayon du cercle");
                cer.getRayon();
                cer.aire();
                cer.perimetre();
                System.out.println(cer.toString());
                break;

        }




    }
}
