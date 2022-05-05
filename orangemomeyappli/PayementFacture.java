package orangemomeyappli;

import java.util.Scanner;

public class PayementFacture {
    private int num_compteur;
    private int num_ligne;
    private int num_ref;
    private String codesecret;
    Scanner sc = new Scanner(System.in);

    public PayementFacture(int num_compteur, int num_ligne, int num_ref) {
        this.num_compteur = num_compteur;
        this.num_ligne = num_ligne;
        this.num_ref = num_ref;
    }

    public int getNum_compteur() {
        return num_compteur= sc.nextInt();
    }

    public int getNum_ligne() {
        return num_ligne= sc.nextInt();
    }

    public int getNum_ref() {
        return num_ref=sc.nextInt();
    }

    public String getCodesecret() {
        return codesecret= sc.nextLine();
    }

    @Override
    public String toString() {
        return "facture payée avec succès";
    }
}
