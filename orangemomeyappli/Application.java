package orangemomeyappli;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String num = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)?([0-9]{2})";
        String num = "^(7[7-8])([0-9]{3})([0-9]{2})([0-9]{2})";
        String code = "^([0-9]{4})";
        Pattern p = Pattern.compile(num);
        Pattern p1= Pattern.compile(code);

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
                Matcher m = p.matcher(s.getNum_phone());
                Matcher m1 = p1.matcher(s.getCodesecret());
                if(m.find() && m1.find()){
                    System.out.println(s.toString());
                }
                else System.out.println("erreur");
                break;
            case 2:
                TransfertArgent ta = new TransfertArgent("1","2","3");
                System.out.println("1- Transfert vers un numéro orange money" +
                        "\n" + "2- transfert avec code");
                int trans = sc.nextInt();
                switch (trans){
                    case 1:
                        System.out.println("veuiller saisir le numéro orange money qui doit recevoir le transfert ");
                        Matcher M = p.matcher(ta.getNum_om());
                        System.out.println("donner le montant à transférer");
                        int montant = sc.nextInt();
                        System.out.println("veuiller valider avec votre code secret");
                        Matcher M1= p1.matcher(ta.getCodesecret());
                        if(M.find() && M1.find()){
                            System.out.println(ta.toString());
                        }
                        else System.out.println("erreur");
                        break;
                    case 2:
                        System.out.println("veuiller saisir le numéro orange money qui doit recevoir le transfert ");
                        Matcher ma = p.matcher(ta.getAutre_num());
                        System.out.println("donner le montant à transférer");
                        int mont = sc.nextInt();
                        System.out.println("veuiller valider avec votre code secret");
                        Matcher Ma = p1.matcher(ta.getCodesecret());
                        if(ma.find() && Ma.find()){
                            System.out.println(ta.toString());
                        }
                        else System.out.println("erreur");
                        break;
                }
                break;
            case 3:
                System.out.println("1- SONATEL" + "\n" +"2- SENELEC" + "\n" +"3- SEN'EAU");
                int pay = sc.nextInt();
                PayementFacture pa = new PayementFacture(1,2,3);
                switch (pay){
                    case 1:
                        System.out.println("pour payer votre facture fixe veuiller saisir le numéro de ligne");
                        pa.getNum_ligne();
                        System.out.println("veuillez confirmer le payement avec votre code secret");
                        pa.getCodesecret();
                        Matcher Ma = p1.matcher(pa.getCodesecret());
                        if(Ma.find() ){
                            System.out.println(pa.toString());
                        }
                        else System.out.println("erreur");
                        break;
                    case 2:
                        System.out.println("pour payer votre facture senelec veuiller saisir le numéro du compteur ");
                        pa.getNum_compteur();
                        System.out.println("veuillez confirmer le payement avec votre code secret");
                        pa.getCodesecret();
                        Matcher M = p1.matcher(pa.getCodesecret());
                        if(M.find() ){
                            System.out.println(pa.toString());
                        }
                        else System.out.println("erreur");
                        break;
                    case 3:
                        System.out.println("pour payer votre facture SEN'EAU veuiller saisir le numéro de référence ");
                        pa.getNum_ref();
                        System.out.println("veuillez confirmer le payement avec votre code secret");
                        pa.getCodesecret();
                        Matcher mat = p1.matcher(pa.getCodesecret());
                        if(mat.find() ){
                            System.out.println(pa.toString());
                        }
                        else System.out.println("erreur");
                        break;
                }
                break;
            case 4:
                System.out.println("je souhaite acheter du credit telephonique" + "\n" + "1- mon numéro" + "\n" +
                        "2- un autre numéro orange");
                int achat = sc.nextInt();
                AchatCredit ac = new AchatCredit("1","2","3");
                switch (achat){
                    case 1:
                        System.out.println("veuiller saisir votre numéro ");
                        Matcher M = p.matcher(ac.getMon_num());
                        System.out.println("donner le montant à acheter");
                        int montant = sc.nextInt();
                        System.out.println("veuiller valider avec votre code secret");
                        Matcher M1= p1.matcher(ac.getCodesecret());
                        if(M.find() && M1.find()){
                            System.out.println(ac.toString());
                        }
                        else System.out.println("erreur");
                        break;
                    case 2:
                        System.out.println("veuiller saisir le numéro orange qui doit recevoir l'achat' ");
                        Matcher ma = p.matcher(ac.getAutre_num());
                        System.out.println("donner le montant à acheter");
                        int mont = sc.nextInt();
                        System.out.println("veuiller valider avec votre code secret");
                        Matcher Ma = p1.matcher(ac.getCodesecret());
                        if(ma.find() && Ma.find()){
                            System.out.println(ac.toString());
                        }
                        else System.out.println("erreur");
                        break;
                }
                break;
        }

    }
}
