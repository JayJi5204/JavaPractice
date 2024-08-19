package construct;

public class MethodInitMain4 {
    public static void main(String[] args) {
        UserConstruct user1 = new UserConstruct("user1", 10);
        //새로 추가한 생성자는 age를 받지 않고 20으로 된다.
        UserConstruct user2 = new UserConstruct("user2");

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