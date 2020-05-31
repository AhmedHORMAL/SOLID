package openclosed.strategyextended;

import openclosed.strategyextended.newServerCase.BigServer;

public class DemoStrategy {

    public static void main(String[] args) {

        ClientInterface clientInterface = new Server();
        Client client = new Client(clientInterface);
        client.start();

        //Changing the server
        ClientInterface clientInterface2 = new BigServer();
        client = new Client(clientInterface2);
        client.start();
    }
}
