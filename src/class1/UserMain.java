package class1;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User();
        user1.age = 10;
        User user2 = user1; //user1의 참조값 대입
        // user1과 user2의 참조값은 같다
        System.out.println(user1.age); // 10
        System.out.println(user2.age); // 10

        user1.age = 20; // user1.age 값 변경
        // user1과 user2는 같은 인스턴스를 참조하기에 둘 다 20으로 변경된다.
        System.out.println(user1.age); // 20
        System.out.println(user2.age); // 20

        user2.age = 30; //user2.age 값 변경
        //위와 마찬가지로 둘 다 30으로 변경된다.
        System.out.println(user1.age); // 30
        System.out.println(user2.age); // 30

    }
}
// - 결과값 -
// 10
// 10
// 20
// 20
// 30
// 30