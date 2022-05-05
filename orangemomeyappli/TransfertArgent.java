package orangemomeyappli;


public class TransfertArgent extends Achat_transfert {
    private String num_om;

    public TransfertArgent(String codesecret, String autre_num, String num_om) {
        super(codesecret, autre_num);
        this.num_om = num_om;
    }

    public String getNum_om() {
        return num_om= sc.nextLine();
    }

    @Override
    public String toString() {
        return "votre transfert a réussi";
    }
}
