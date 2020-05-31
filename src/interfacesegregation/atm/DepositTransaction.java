package interfacesegregation.atm;

public class DepositTransaction implements Transaction {
    private DepositUI depositUI;

    public DepositTransaction(DepositUI ui) {
        depositUI = ui;
    }

    @Override
    public  void execute() {
        /*code*/
        depositUI.requestDepositAmount();
        /*code*/
    }
}
