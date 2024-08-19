package lang.object.equals;

public class User {
    private final String id;

    public User(String id) {
        this.id = id;
    }
    //equals() 재정의
    @Override
    public boolean equals(Object object) {
        //객체의 특정 값을 사용하려면 다운캐스팅이 필요하다.
        User user = (User) object;
        //문자열 비교는 ==가 아니라 equals를 사용해야한다.
        return id.equals(user.id);
    }
}
