package extends1.ex1;

public class ElectricCar extends Car {
    //extends Car를 사용해서 부모클래스인 Car를 상속받는다.
    //ElectricCar에서도 move를사용할 수 있다.
    public void charge() {
        System.out.println("충전");
    }
}
