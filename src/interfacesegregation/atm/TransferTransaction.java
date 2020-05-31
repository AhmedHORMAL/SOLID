package interfacesegregation.atm;

public class TransferTransaction implements Transaction {
    private TransferUI transferUI;

    public TransferTransaction(TransferUI ui) {
        transferUI = ui;
    }

    public void execute() {
        /*code*/
        transferUI.requestTransferAmount();
        /*code*/
    }
}

