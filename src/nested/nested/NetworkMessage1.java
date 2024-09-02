package nested.nested;

//Network 객체 안에서만 사용
public class NetworkMessage1 {
    private String content;

    public NetworkMessage1(String content) {
        this.content = content;
    }
    public void print(){
        System.out.println(content);
    }
}
