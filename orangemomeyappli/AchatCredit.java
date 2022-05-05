package orangemomeyappli;

public class AchatCredit extends Achat_transfert {
    private String mon_num;


    public AchatCredit(String codesecret, String autre_num, String mon_num) {
        super(codesecret, autre_num);
        this.mon_num = mon_num;
    }

    public String getMon_num() {
        return mon_num= sc.nextLine();
    }

    @Override
    public String toString() {
        return "crédit acheté avec succès";
    }
}
