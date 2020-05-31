package interfacesegregation.atm;

public class WithdrawalTransaction implements Transaction {
    private WithdrawalUI withdrawalUI;

    public WithdrawalTransaction(WithdrawalUI ui) {
        withdrawalUI = ui;
    }

    @Override
    public void execute() {
        /*code*/
        withdrawalUI.requestWithdrawalAmount();
        /*code*/
    }
}
