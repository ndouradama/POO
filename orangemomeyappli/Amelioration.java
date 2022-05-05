package orangemomeyappli;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amelioration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) solde des comptes");
        System.out.println("2) transfert d'argent");
        System.out.println("3) payement de facture");
        System.out.println("4) achat de credit");
        System.out.println("---------------------------------------");
        System.out.println("veiller saisir votre choix");
        int choix = sc.nextInt();

        switch (choix){
            case 1:
                SoldeCompte s = new SoldeCompte("4","3");
                System.out.println("donner votre numéro de téléphone et votre code secret");
                break;
            case 2:
                TransfertArgent ta = new TransfertArgent("1","2","3");
                System.out.println("1- Transfert vers un numéro orange money" +
                        "\n" + "2- transfert avec code");
                int trans = sc.nextInt();
                switch (trans){
                    case 1:
                        System.out.println("veuiller saisir le numéro orange money qui doit recevoir le transfert ");
                        System.out.println("donner le montant à transférer");
                        int montant = sc.nextInt();
                        System.out.println("veuiller valider avec votre code secret");
                        break;
                    case 2:
                        System.out.println("veuiller saisir le numéro orange money qui doit recevoir le transfert ");
                        System.out.println("donner le montant à transférer");
                        int mont = sc.nextInt();
                        System.out.println("veuiller valider avec votre code secret");
                        break;
                }
                break;
            case 3:
                System.out.println("1- SONATEL" + "\n" +"2- SENELEC" + "\n" +"3- SEN'EAU");
                int pay = sc.nextInt();
                switch (pay){
                    case 1:



                }
                break;

        }




    }

    public static String verificate(String phonenumber , String phonecode){
        String num = "^(7[7-8])([0-9]{3})([0-9]{2})([0-9]{2})";
        String code = "^([0-9]{4})";
        Pattern p = Pattern.compile(num);
        Pattern p1= Pattern.compile(code);
        Matcher m = p.matcher(phonenumber);
        Matcher m1= p1.matcher(phonecode);
        if(m.find() && m1.find()){
            System.out.println("réussi");
        }
        else System.out.println("erreur");

        return phonenumber  + phonecode;
    }
}
