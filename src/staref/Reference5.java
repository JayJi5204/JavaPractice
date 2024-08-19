package staref;

public class Reference5 {
    public static void main(String[] args) {
        User user1 = craeteUser("User1", 10);
        User user2 = craeteUser("User2", 20);

        printUser(user1);
        printUser(user2);

    }

    static User craeteUser(String name, int age) {
        User user = new User();
        user.name = name;
        user.age = age;
        return user;
    }

    static void printUser(User userX) {
        System.out.println(userX.name + ", " + userX.age);
    }
}
// - 결과값 -
// User1, 10
// User2, 20