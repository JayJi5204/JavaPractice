package construct;

public class UserConstruct {
    String name;
    int age;

    UserConstruct(String name, int age) { //이 부분이 생성자이다.
        this.name = name;
        this.age = age;
    }

    //추가
    UserConstruct(String name) {
        this.name = name;
        this.age = 20;
    }
}

