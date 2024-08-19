package oop1;

public class CarSpeedMain2 {
    public static void main(String[] args) {
        CarSpeedData data = new CarSpeedData();

        on(data);
        speedUp(data);
        speedUp(data);
        speedDown(data);
        showStatus(data);
        off(data);
    }

    static void on(CarSpeedData data) {
        data.engine = true;
        System.out.println("Engine Start");
    }

    static void off(CarSpeedData data) {
        data.engine = false;
        System.out.println("Engine Off");
    }

    static void speedUp(CarSpeedData data) {
        data.speed++;
        System.out.println("Now Speed : " + data.speed);
    }

    static void speedDown(CarSpeedData data) {
        data.speed--;
        System.out.println("Now Speed : " + data.speed);
    }

    static void showStatus(CarSpeedData data) {
        System.out.println("Check Engine");
        if (data.engine) {
            System.out.println("Engine On, Now Speed : " + data.speed);
        } else {
            System.out.println("Engine Off");
        }
    }
}
// - 결과값 -
//Engine Start
//Now Speed : 1
//Now Speed : 2
//Now Speed : 1
//Check Engine
//Engine On, Now Speed : 1
//Engine End