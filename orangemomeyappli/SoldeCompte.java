package orangemomeyappli;


import java.util.Scanner;

public class SoldeCompte {
    private String codesecret;
    private String num_phone;
    Scanner sc = new Scanner(System.in);

    public SoldeCompte(String codesecret,String num_phone){
        this.codesecret = codesecret;
        this.num_phone = num_phone;
    }

    public String  getCodesecret() {
        return codesecret = sc.nextLine();
    }

    public String getNum_phone() {
        return num_phone= sc.nextLine();
    }

    @Override
    public String toString() {
        return "votre solde est 10000";
    }
}