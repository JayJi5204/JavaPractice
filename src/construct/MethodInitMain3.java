package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        UserConstruct user1 = new UserConstruct("user1", 10);
        UserConstruct user2 = new UserConstruct("user2", 20);

        UserConstruct[] users = {user1, user2};

        for (UserConstruct user : users) {
            System.out.println(user.name);
            System.out.println(user.age);
        }
    }
}
// - 결과값 -
//User1
//10
//User2
//20