package orangemomeyappli;

import java.util.Scanner;

public class Om {
    public static void main(String[] args) {

        Integer choix;
        int codesecret;


        System.out.println("1) solde des comptes");
        System.out.println("2) transfert d'argent");
        System.out.println("3) payement de facture");
        System.out.println("4) achat de credit");

        System.out.println("veuiller saisir votre choix");
        Scanner sc = new Scanner(System.in);
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("1- solde de mon compte orange money");
                Integer choix1;
                choix1 = sc.nextInt();
                switch (choix1) {

                    case 1:
                        System.out.println("veuillez entrer votre code secret");
                        codesecret = sc.nextInt();
                        Integer soldeCompte = 100000;
                        System.out.println("le solde de votre compte est " + soldeCompte);
                }
                break;
            case 2:
                System.out.println("1- transfert national");
                Integer choix2;
                choix2 = sc.nextInt();
                System.out.println("1- vers un numero orange money ");
                System.out.println("2- vers un autre numero");
                Integer choix2_1;
                choix2_1 = sc.nextInt();
                switch (choix2_1) {
                    case 1:
                        System.out.println("saissir le numéro qui doit recevoir le transfert");
                        Integer numOm;
                        numOm = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("veuiller saisir le numero du destinataire");
                        Integer num;
                        num = sc.nextInt();
                        break;
                }
                break;
            case 3:
                System.out.println("1- SONATEL");
                System.out.println("2- SENELEC");
                System.out.println("3- SEN'EAU");
                Integer choix3;
                choix3 = sc.nextInt();
                if (choix3 == 1) {
                    System.out.println("1- payer ma facture fixe");
                    System.out.println("2- payer mes frais d'accès");
                    Integer choix4;
                    choix4 = sc.nextInt();
                    switch (choix4) {
                        case 1:
                            System.out.println("pour payer votre facture fixe veuiller saisir le numéro de ligne");
                            Integer numligne;
                            numligne = sc.nextInt();
                            break;
                        case 2:
                            System.out.println("je tape le numéro de la demande");
                            Integer numdem;
                            numdem = sc.nextInt();
                            break;
                    }
                } else if (choix3 == 2) {
                    System.out.println("1- facture SENELEC");
                    System.out.println("2- recharge Woyofal");
                    Integer choix0;
                    choix0 = sc.nextInt();
                    switch (choix0) {
                        case 1:
                            System.out.println("pour payer votre facture senelec veuiller saisir le numéro de police ou le compte contrat");
                            Integer numligne;
                            numligne = sc.nextInt();
                            break;
                        case 2:
                            System.out.println("veuillez entrer le numero du compteur");
                            Integer numdem;
                            numdem = sc.nextInt();
                            break;
                    }
                } else if (choix3 == 3) {
                    System.out.println("1- facture à payer");
                    Integer choixI;
                    choixI = sc.nextInt();
                    switch (choixI) {
                        case 1:
                            System.out.println("tapez le numero de reference client");
                            Integer numRef;
                            numRef = sc.nextInt();
                            break;

                    }

                }
                break;

            case 4:
                System.out.println("je souhaite acheter du credit telephonique");
                System.out.println("1- mon numéro");
                System.out.println("2- un autre numéro orange ou kirene");
                Integer achat;
                achat = sc.nextInt();
                switch (achat) {
                    case 1:
                        System.out.println("j'achete pour mon numero");
                        System.out.println("1- du credit telephonique");
                        System.out.println("2- illimix");
                        System.out.println("3- pass internet");
                        System.out.println("4- illifex");
                        System.out.println("5- pass wifi");
                        System.out.println("6- pass allo monde");
                        System.out.println("7- pass allo Afrique");
                        break;
                    case 2:
                        System.out.println("1- du credit telephonique");
                        System.out.println("2- illimix");
                        System.out.println("3- pass internet");
                        System.out.println("4- illifex");
                        break;
                }

                break;
        }
    }
}
