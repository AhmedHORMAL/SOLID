package openclosed.strategyextended.newServerCase;

public class BigServer implements ClientBigInterface {

    @Override
    public void connect() {
        System.out.println("Connecting...");
    }

    @Override
    public void safeConnection() {
        System.out.println(" Safe Connecting...");

    }
}
