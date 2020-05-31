package openclosed.strategyextended;

public class Server implements ClientInterface {

    @Override
    public void connect() {
        System.out.println("Connecting...");
    }
}
