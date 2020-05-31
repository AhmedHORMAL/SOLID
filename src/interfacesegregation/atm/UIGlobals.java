package interfacesegregation.atm;

public class UIGlobals {
    public static WithdrawalUI withdrawal;
    public static DepositUI deposit;
    public static TransferUI transfer;

    public UIGlobals() {
        UI Lui = new AtmUI(); // Some UI implementation
        UIGlobals.deposit = Lui;
        UIGlobals.withdrawal = Lui;
        UIGlobals.transfer = Lui;
    }
}
