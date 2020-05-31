package interfacesegregation.atm;

public class Demo {
    UI Gui; // global object;

    void f()
    {
        DepositTransaction dt = new DepositTransaction(Gui);
    }
}
