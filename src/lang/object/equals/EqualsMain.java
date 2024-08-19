package lang.object.equals;

public class EqualsMain {
    public static void main(String[] args) {
        User user1=new User("id1");
        User user2=new User("id1");

        System.out.println("identity = "+(user1==user2));
        System.out.println("equality = "+ user1.equals(user2));
    }
}
// - 결과값 -
// identity = false
// equality = true
