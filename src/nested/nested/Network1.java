package nested.nested;

public class Network1 {
    public void sendMessage(String text) {
        NetworkMessage1 networkMessage1 = new NetworkMessage1(text);
        networkMessage1.print();
    }
}
