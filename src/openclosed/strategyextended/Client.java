package openclosed.strategyextended;

//Client is both open and closed.
//We can change ClientInterface to add new
public class Client {

    private ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void start() {
        clientInterface.connect();
    }
}
