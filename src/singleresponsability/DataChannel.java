package singleresponsability;

public interface DataChannel {
    void send(char c);
    char receive();
}
