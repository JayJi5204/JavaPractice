package access.a;

import access.a.AccessData;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public은 모든 접근을 허용하기 때문에 호출 가능하다.
        data.publicField = 1;
        data.publicMethod();
        // default는 같은 패키지 에서 접근하기 하기 때문에 호출 가능하다.
        data.defaultField = 2;
        data.defaultMethod();
        // private은 AccessData 내부에서만 접근할 수 있기 떄문에 호출 불가능하다.
        //data.privateField = 3;
        //data.privateMethod();
        //innerAccess는 외부에서 호출되었지만 AccessData에 포함되어서
        // 자신의 private 필드와 메서드 모두 접근할 수 있다.
        data.innerAccess();
    }
}
// - 결과값 -
// 1
// 2
// 100
// 200
// 300
