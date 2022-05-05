package orangemomeyappli;

import java.util.Scanner;

public class Achat_transfert {
    private String codesecret;
    private String autre_num;
    Scanner sc = new Scanner(System.in);

    public Achat_transfert(String codesecret, String autre_num) {
        this.codesecret = codesecret;
        this.autre_num = autre_num;
    }

    public String getCodesecret() {
        return codesecret = sc.nextLine();
    }

    public String getAutre_num() {
        return autre_num= sc.nextLine();
    }
}
