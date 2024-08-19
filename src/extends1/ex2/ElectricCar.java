package extends1.ex2;

public class ElectricCar extends Car {

    @Override //@이 붙은 부분을 어노테이션이라 한다.
    public void move(){
        System.out.println("가속");
    }
    public void charge() {
        System.out.println("충전");
    }
}
