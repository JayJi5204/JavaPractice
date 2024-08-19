package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        UserInit user1 = new UserInit();
        user1.name = "User1";
        user1.age = 10;

        UserInit user2 = new UserInit();
        user2.name = "User2";
        user2.age = 20;

        UserInit[] users = {user1, user2};
        for (UserInit user : users) {
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